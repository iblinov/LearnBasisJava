package by.bsu2.threads.synchro;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicDemo {
    private static final int NUMBER_BROKERS = 30;

    public static void main(String[] args) {

        Broker.market = new Market(new AtomicLong(100));
        Broker.market.start();

        for (int i = 0; i < NUMBER_BROKERS; i++) {
            new Broker().start();
        }
    }
}
