package by.threads.stock_exchange.entity;

import by.threads.stock_exchange.registration.TransactionRegistrar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;


public class Transaction implements Runnable {

    static final Logger LOG = LogManager.getLogger();
    private long transactionId;
    private Phaser phaser;
    // true - buying
    private boolean operation;
    private String shareName;
    private int packageSize;
    private Broker broker;
    final long TIME;
    private MarketPlace marketPlace;

    public Transaction(Phaser phaser, boolean operation, String shareName, int packageSize, Broker broker) {

        TIME = new Date().getTime();
        transactionId = TransactionRegistrar.register();
        this.operation = operation;
        this.shareName = shareName;
        this.packageSize = packageSize;
        this.broker = broker;
        this.phaser = phaser;
        phaser.register();

    }

    public long getTime() {
        return TIME;
    }

    public MarketPlace getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
    }

    public boolean isOperation() {
        return operation;
    }

    public void setOperation(boolean operation) {
        this.operation = operation;
    }

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(int packageSize) {
        this.packageSize = packageSize;
    }

    public long getTransactionId() {
        return transactionId;
    }

    @Override
    public void run() {
        try {
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(50));
            if (operation) {
                marketPlace.buy(packageSize, broker, TIME);

            } else {
                marketPlace.sell(packageSize, broker, TIME);
            }
            LOG.info("Transaction №" + transactionId +" closed.");

        } catch (InterruptedException e) {
            LOG.error("Transaction №" + transactionId + " interrupt. " + e.getMessage());
        } finally {
            phaser.arriveAndDeregister();
        }
    }
}
