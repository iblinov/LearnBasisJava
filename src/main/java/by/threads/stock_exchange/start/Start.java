package by.threads.stock_exchange.start;

import by.threads.stock_exchange.entity.ExchangeManager;
import by.threads.stock_exchange.entity.StockExchange;
import by.threads.stock_exchange.io.ExchangeResultWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Start {

    static final Logger LOG = LogManager.getLogger();

    public static void main(String[] args) {

        StockExchange exchange = StockExchange.getInstance();
        ExchangeManager manager = new ExchangeManager("Dima");
        manager.setExchange(exchange);
        manager.addBrokers(20);
        ExchangeResultWriter.write(manager, "data/result.txt");

        try {
            manager.start();
            Thread.sleep(12_000);
            manager.stopExchange();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            LOG.error(" Error in main." + e.getMessage());
        }
        finally {
            ExchangeResultWriter.write(manager, "data/result.txt");
        }
    }
}
