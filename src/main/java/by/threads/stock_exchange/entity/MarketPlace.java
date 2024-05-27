package by.threads.stock_exchange.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MarketPlace {

    static final Logger LOG = LogManager.getLogger();
    private Share share;

    private ExecutorService sellPool;
    private ExecutorService buyPool;

    // request for deal. price < nominal
    private boolean dealRequest;
    private boolean dealResponse;
    private int dealPrice;

    int packageToBuy;
    int packageForSale;

    long buyShareTime;
    long saleShareTime;

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public MarketPlace(Share share) {
      this.share = share;
      sellPool = Executors.newFixedThreadPool(1);
      buyPool = Executors.newFixedThreadPool(1);
    }

    public void sell(int packageSize, Broker broker, long time) {


        try {
            lock.lock();
            packageForSale = packageSize;
            saleShareTime = time;
            LOG.info( "Broker " + broker. getName() +" gives Lok");
            condition.signal();
            condition.await();

            // verification -  is not there already bought some shares ?
            if (packageSize > packageForSale) {
                int buyingCount = packageSize - packageForSale;
                broker.rechargeAccount(buyingCount * share.getValue());
                broker.writeOffShare(share.toString(), buyingCount);
                //changeValue(buyingCount);
            }

            // loop as long as the shares are not sold
            while (packageForSale > 0) {

                int ostatok = packageForSale;
                int sharePrice = share.getValue();

                if (packageToBuy == 0) {
                    condition.await();
                }

                //check of reply
                if (dealRequest) {
                    int price = dealPrice;
                    int realPrice = share.getValue();
                    double perc = 0.95;
                    double otnoshenie = (double) (price / realPrice);
                    // make a decision
                    if (otnoshenie >= perc) {
                        int decision = Math.abs(new Random().nextInt(2));
                        if (decision > 0) {
                            LOG.info("### The seller agreed to sell at a bargain price.");
                            dealResponse = true;
                            sharePrice = dealPrice;
                            condition.signal();
                            condition.await();
                        } else {
                            LOG.info("### The seller NOT agreed to sell at a bargain price.");
                            dealResponse = false;
                            condition.signal();
                            condition.await();
                        }
                    } else {
                        LOG.info("### The seller NOT agreed to sell at a bargain price.");
                        dealResponse = false;
                        condition.signal();
                        condition.await();
                    }
                }
                if (ostatok > packageForSale) {
                    int buyingCount = ostatok - packageForSale;
                    broker.rechargeAccount(buyingCount * sharePrice);
                    broker.writeOffShare(share.toString(), buyingCount);
                    changeValue(buyingCount);
                }
            }

        } catch (InterruptedException e) {
            LOG.error("The sale process was interrupted.  " + e.getMessage());
        }
        finally {
            lock.unlock();
        }
    }

    public void buy(int packageSize, Broker broker, long time) {
        try {
            lock.lock();
            packageToBuy = packageSize;
            buyShareTime = time;
            // loop as long as the shares are not sold
            while( packageToBuy != 0) {
                while( packageForSale == 0) {
                LOG.info("Waiting for wishing to sell.");
                condition.await();
                }
//                since for the time spent in the queue
//                value of the shares could increase -
//                do check for sufficient funds
                if (packageForSale >= packageToBuy) {

                    // enough money
                    if (checkMoney(broker.getMoney())) {
                        broker.debitAccount(packageToBuy * share.getValue());
                        broker.addShare(share.toString(), packageToBuy);
                        packageForSale -= packageToBuy;
                        packageToBuy = 0;
                        LOG.info("Bought all shares. The transaction is completed.");
                        condition.signal();

                    // not enough money
                    // try to agree on a price below market
                    } else  {
                        int requestPrice = broker.getMoney() / packageToBuy;
                        // agreed. buy at a bargain price
                        if (reachAgreement( requestPrice)) {
                            broker.debitAccount(packageToBuy * requestPrice);
                            broker.addShare(share.toString(), packageToBuy);
                            packageForSale -= packageToBuy;
                            packageToBuy = 0;
                            LOG.info("### Bought all shares at a bargain price. The transaction is completed.");
                            condition.signal();

                        // not agreed. buy the largest possible number of shares
                        } else {
                            int newPackage = broker.getMoney() / share.getValue();
                            broker.debitAccount(newPackage * share.getValue());
                            broker.addShare(share.toString(), newPackage);
                            packageForSale -= newPackage;
                            packageToBuy = 0;
                            LOG.info("### Not agree. Bought at all. The transaction is completed.");
                            condition.signal();
                        }
                        dealRequest = false;
                        dealResponse = false;
                    }
                } else {
                    broker.debitAccount(packageForSale * share.getValue());
                    broker.addShare(share.toString(), packageForSale);
                    packageToBuy -= packageForSale;
                    packageForSale = 0;
                    LOG.info("Bought all the shares in 1 broker. Waiting for the next one.");
                    condition.signal();
                }
            }

        } catch (InterruptedException e ) {
            LOG.error("The sale process was interrupted. " + e.getMessage());
        }
        finally {
            lock.unlock();
        }
    }

    private boolean checkMoney(int money) {
        int price = share.getValue();
        int totalPrice = price * packageToBuy;
        return (money >= totalPrice);
    }

    private boolean reachAgreement (int price) throws InterruptedException{
        dealRequest = true;
        dealPrice = price;
        LOG.info(" Broker requests to sell shares cheaper.");
        condition.signal();
        condition.await();
        return  dealResponse;
    }

    public Share getShare() {
        return share;
    }

    private void changeValue(int size) {

        final int COEFFICIENT = 3;
        int oldValue = share.getValue();
        int newValue;

        if (buyShareTime > saleShareTime) {
            newValue = (int) (oldValue * (1 + COEFFICIENT * new Random().nextDouble() * size / share.getISSUED_SHARES()));
        } else {
            newValue = (int) (oldValue * (1 - COEFFICIENT * new Random().nextDouble() * size / share.getISSUED_SHARES()));
        }

        share.setValue(newValue);
    }

    public void addToSellPool(Transaction transaction) {
        sellPool.submit(transaction);
    }

    public void addToBuyPool(Transaction transaction) {
        buyPool.submit(transaction);
    }

    public void stop() {
        buyPool.shutdownNow();
        sellPool.shutdownNow();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarketPlace)) return false;

        MarketPlace place = (MarketPlace) o;

        if (dealRequest != place.dealRequest) return false;
        if (dealResponse != place.dealResponse) return false;
        if (dealPrice != place.dealPrice) return false;
        if (packageToBuy != place.packageToBuy) return false;
        if (packageForSale != place.packageForSale) return false;
        if (buyShareTime != place.buyShareTime) return false;
        if (saleShareTime != place.saleShareTime) return false;
        return getShare() == place.getShare();

    }

    @Override
    public int hashCode() {
        int result = getShare().hashCode();
        result = 31 * result + (dealRequest ? 1 : 0);
        result = 31 * result + (dealResponse ? 1 : 0);
        result = 31 * result + dealPrice;
        result = 31 * result + packageToBuy;
        result = 31 * result + packageForSale;
        result = 31 * result + (int) (buyShareTime ^ (buyShareTime >>> 32));
        result = 31 * result + (int) (saleShareTime ^ (saleShareTime >>> 32));
        return result;
    }
}
