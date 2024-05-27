package by.threads.stock_exchange.registration;

import java.util.concurrent.atomic.AtomicInteger;

public class TransactionRegistrar {

    private static AtomicInteger count = new AtomicInteger(0);

    public static int register() {
        return count.getAndIncrement();
    }
}
