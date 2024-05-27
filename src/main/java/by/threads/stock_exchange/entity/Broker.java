package by.threads.stock_exchange.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class Broker extends Thread {

    static final Logger LOG = LogManager.getLogger();
    private Phaser phaser;
    private String name;
    private  int money;
    private StockExchange exchange;
    private Map<String,Integer> shares = new LinkedHashMap<>();

    public Broker(String name, int money, StockExchange exchange) {
        super(name);
        this.money = money;
        this.name = name;
        this.exchange = exchange;
        phaser = new Phaser();
        phaser.register();
    }

    public String getBrokerName() {
        return name;
    }

    public void setBrokerName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void debitAccount(int sum) {
        money -= sum;
        LOG.info("$$$ Broker " + getName() + " wrote off from the account " + sum);
    }

    public void rechargeAccount(int sum) {
        money += sum;
        LOG.info("$$$ Broker " + getName() + "  added to the account " + sum);
    }

    public StockExchange getExchange() {
        return exchange;
    }

    public void setExchange(StockExchange exchange) {
        this.exchange = exchange;
    }

    public Map<String, Integer> getShares() {
        return shares;
    }

    public void setShares(Map<String, Integer> shares) {
        this.shares = shares;
    }

    public void addShare(String share, int packageSize) {
        if (shares.containsKey(share)) {
            int newSize = shares.get(share) + packageSize;
            shares.put(share, newSize);
        } else {
            shares.put(share, packageSize);
        }
        LOG.info("@@@ Added to the broker " + getName() + " "  + packageSize + " shares " + share);
    }

    public void writeOffShare(String share, int packageSize) {
        int oldSize = shares.get(share);
        int newSize = oldSize - packageSize;
        if (newSize > 0) {
            shares.put(share, newSize);
            LOG.info("@@@ Wrote off from the account Broker " + getName() + " "  + packageSize + " shares " + share);
        } else {
            shares.remove(share);
            LOG.info("@@@ Wrote off from the account Broker " + getName() + " "  + packageSize + " all shares " + share);
        }

    }

    public int determineBalance() {
        int balance = this.getMoney();
        if (shares.size() > 0) {
            for (Map.Entry<String, Integer> map : shares.entrySet()) {
                Share share = Share.valueOf(map.getKey());
                int value = share.getValue();
                int count = map.getValue();
                balance += value * count;
            }
        }
        return balance;
    }

    @Override
    public void run() {
        try{
            while (!exchange.isStop()) {
                //CASE 1:  when there is no money to buy any shares
                if (money < exchange.getMinShareValue()) {
                    think(50);
                    int decision = makeDecision();
                    if ( decision > 0) {
                        think(1000);
                        LOG.info("Broker " + name + " decided to refrain from trading.");
                    } else {
                        sellShares();
                    }
                //CASE 2:  when no one shares
                } else if (shares.size() == 0) {
                    think(50);
                    int decision = makeDecision();
                    if ( decision > 0) {
                        LOG.info("Broker " + name + " decided to refrain from trading.");
                        think(1000);
                    } else {
                        buyShares();
                    }
                //DEFAULT: identifies with the operation
                } else {
                    think(50);
                    int decision = Math.abs(makeDecision());
                    switch (decision) {
                        case 2:
                            sellShares();
                            break;
                        case 1:
                            buyShares();
                            break;
                        case 0:
                            LOG.info("Broker " + name + " decided to refrain from trading.");
                            think(3000);
                            break;
                    }

                }
             }
        } catch (InterruptedException e) {
            LOG.error("Broker " + getBrokerName() + " is interrupted. " + e.getMessage());
        } finally {
            LOG.info("Broker " + getName() + " is finished.");
        }
    }

    private int makeDecision() {
        return   new Random().nextInt(3);
    }

    private void think(int millisec) throws InterruptedException{
        TimeUnit.MILLISECONDS.sleep(new Random().nextInt(millisec));
    }

    private void sellShares() {
        // determine what shares will trade
        int sharePackageCount = shares.size();
        ArrayList<String> list = new ArrayList<>(sharePackageCount);
        list.addAll(shares.keySet());
        int choice = Math.abs(new Random().nextInt(sharePackageCount));
        String share = list.get(choice);

        // determine number of shares sold
        int count = Math.abs(new Random().nextInt(shares.get(share)));
        // если рандом - 0 , переопределяем
        while (count == 0) {
            count = Math.abs(new Random().nextInt(shares.get(share)));
        }

        //String.format("Broker %s wants to sell %d share(s) of %s.",this.getBrokerName(),count,share);
        LOG.info("Broker " + this.getBrokerName() + " wants to sell " + count + " share(s) of " + share);

        Transaction transaction = new Transaction(phaser, false, share, count, this);
        LOG.debug("Broker " + this.getBrokerName() + " create transaction №" + transaction.getTransactionId() );
        exchange.addPhaser(phaser);
        exchange.addTransaction(transaction);

        phaser.arriveAndAwaitAdvance();
        LOG.info(String.format("Selling by broker %s was finished.",this.getBrokerName()));
    }

    private void buyShares() {
        // determine which of the available shares on the Stock Exchange will buy
        ArrayList<Share> list = exchange.getShares();
        int choice = Math.abs(new Random().nextInt(list.size()));
        Share share = list.get(choice);

        // check whether there is enough money for at least 1 share
        // if not enough - choose a different action
        while (money < share.getValue()) {
            choice = Math.abs(new Random().nextInt(list.size()));
            share = list.get(choice);
        }

        // determine number of shares sold
        int maxSize = this.getMoney() / share.getValue();
        int count = Math.abs(new Random().nextInt(maxSize));
        // if random - 0 , redefine
        while (count == 0) {
           count = Math.abs(new Random().nextInt(maxSize));
        }

        LOG.info(String.format("Broker %s wants to buy %d share(s) of %s.",this.getBrokerName(),count,share.toString()));

        Transaction transaction = new Transaction(phaser, true, share.toString(), count, this);
        LOG.debug("Broker " + this.getBrokerName() + " create transaction №" + transaction.getTransactionId() );
        exchange.addPhaser(phaser);
        exchange.addTransaction(transaction);

        phaser.arriveAndAwaitAdvance();
        LOG.info(String.format("Buying by broker %s was finished.",this.getBrokerName()));
    }

    @Override
    public String toString() {
        return name;
    }
}
