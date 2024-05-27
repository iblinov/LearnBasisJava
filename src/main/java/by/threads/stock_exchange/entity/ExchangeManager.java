package by.threads.stock_exchange.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExchangeManager {

    static final Logger LOG = LogManager.getLogger();
    final String DEFAULT_NAME = "Unnamed Manager";
    private String name;
    private StockExchange exchange;
    private ArrayList<Broker> brokers;
    private ExecutorService brokerPool;

    public ExchangeManager(String name) {
        nameValidation(name);
        brokers = new ArrayList<>();
    }

    private void nameValidation(String name) {
        if (name != null && !name.trim().isEmpty()) {
           this.name = name;
        } else {
            name = DEFAULT_NAME;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        nameValidation(name);
    }

    public StockExchange getExchange() {
        return exchange;
    }

    public void setExchange(StockExchange exchange) {

        if (exchange != null) {
            this.exchange = exchange;
        } else {
            LOG.info("Exchange = null. Enter real parameter.");
        }
    }

    public void stopExchange() {
        exchange.stop();
        brokerPool.shutdownNow();
    }

    public void start() {
        brokers.forEach(brokerPool::submit);
    }

    public void addBrokers(int brokerCount) {

        final int startSum = 100_000;
        brokerPool = Executors.newFixedThreadPool(brokerCount);

        // adding shares
        for (int i = 0; i < brokerCount; i++) {
            Broker broker = new Broker("" + i, startSum, exchange);
            Map<String, Integer> startShares = creationPackage(brokerCount);
            broker.setShares(startShares);
            brokers.add(broker);
        }
    }

    public ArrayList<Broker> getBrokers() {
        return brokers;
    }

    private Map<String, Integer> creationPackage(int brokerCount) {

        Map<String, Integer> startShares = new HashMap<>();
        for (Share x: exchange.getShares()) {
            int shareCount =  x.getISSUED_SHARES() / brokerCount;
            startShares.put(x.toString(),shareCount);
        }
        return startShares;
    }

    private int findWinnerSum() {
        int winnerSum = brokers.get(0).determineBalance();
        for (Broker x: brokers) {
            int sum = x.determineBalance();
            if (sum > winnerSum) {
                winnerSum = sum;
            }
        }
        return winnerSum;
    }

    private int findLooserSum() {
        int looserSum = brokers.get(0).determineBalance();
        for (Broker x: brokers) {
            int sum = x.determineBalance();
            if (sum < looserSum) {
                looserSum = sum;
            }
        }
        return looserSum;
    }

    public List<Broker> findWinner() {

        List<Broker> winners = new ArrayList<>();
        int winnerSum = findWinnerSum();
        for (Broker x : brokers) {
            if (x.determineBalance() == winnerSum) {
                winners.add(x);
            }
        }
        return winners;
    }

    public List<Broker> findLooser() {

         List<Broker> loosers = new ArrayList<>();
        int looserSum = findLooserSum();
        for (Broker x : brokers) {
            if (x.determineBalance() == looserSum) {
                loosers.add(x);
            }
        }
        return loosers;
    }

}
