package by.threads.stock_exchange.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class StockExchange {

    static final Logger LOG = LogManager.getLogger();
    // list of phasers
    private ArrayDeque<Phaser> phasers = new ArrayDeque<>();
    // stop for all brokers
    public AtomicBoolean stop = new AtomicBoolean(false);
    private String name;
    private ArrayList<Share> shares = new ArrayList<Share>();
    private Map<String, MarketPlace> marketPlaces = new HashMap<>();
    // fields for singleton
    private static StockExchange instance;
    private static AtomicBoolean isCreated = new AtomicBoolean(false);
    private static Lock lock = new ReentrantLock();

    public static StockExchange getInstance() {
        if (!isCreated.get()) {
            try {
                lock.lock();
                if (instance == null) {
                    instance = new StockExchange();
                    isCreated.set(true);
                }
            } catch (Exception e) {
                LOG.error(e.getMessage());
            }
            finally {
                lock.unlock();
            }
        }
        return instance;
    }

    private StockExchange() {

        name = "Forex";
        shares = new ArrayList<>();
        shares.add(Share.GOOGLE);
        shares.add(Share.APPLE);
        shares.add(Share.MICROSOFT);
        // shares.add(Share.SAMSUNG);
        for (Share x: shares) {
            marketPlaces.put(x.toString(), new MarketPlace(x));
        }
    }

    public int getMinShareValue() {
        int min = shares.get(0).getValue();
        for (Share x: shares) {
            if (x.getValue() < min) {
                min = x.getValue();
            }
        }
        return min;
    }

    public void addTransaction(Transaction transaction) {
        boolean operation = transaction.isOperation();
        String share = transaction.getShareName();
        MarketPlace place = marketPlaces.get(share);
        transaction.setMarketPlace(place);
        if (operation) {
            place.addToBuyPool(transaction);
        } else {
            place.addToSellPool(transaction);

        }
    }

    public Map<String, MarketPlace> getMarketPlaces() {
        return marketPlaces;
    }

    public ArrayList<Share> getShares() {
        return shares;
    }

    public void setShares(ArrayList<Share> shares) {
        this.shares = shares;
    }

    public void addPhaser(Phaser phaser) {
        if (phaser != null) {
            phasers.add(phaser);
        }
    }

    public void stop() {

        try {
            this.stop.set(true);
            TimeUnit.MILLISECONDS.sleep(500);
            for (Map.Entry<String,MarketPlace> x: marketPlaces.entrySet()) {
                x.getValue().stop();
            }
            TimeUnit.MILLISECONDS.sleep(500);
            LOG.info("-------------------------" +
                    "Close all transactions" +
                    "-------------------------");

            phasers.forEach(java.util.concurrent.Phaser::arriveAndDeregister);
            //phasers.forEach(java.util.concurrent.Phaser::arriveAndDeregister);
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            LOG.error(e.getMessage());
        }
    }

    public boolean isStop() {
        return stop.get();
    }
}
