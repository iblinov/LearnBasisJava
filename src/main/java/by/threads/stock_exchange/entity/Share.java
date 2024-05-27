package by.threads.stock_exchange.entity;

import java.util.concurrent.atomic.AtomicInteger;


public enum  Share {

    GOOGLE(new AtomicInteger(200), 10_000),
    APPLE(new AtomicInteger(100), 7_500),
    MICROSOFT(new AtomicInteger(120), 5_000),
    SAMSUNG(new AtomicInteger(80), 5_000);

    private AtomicInteger value;
    private final int ISSUED_SHARES;

    Share(AtomicInteger value , int count) {
        this.value = value;
        ISSUED_SHARES = count;
    }

    public void setValue(int value) {
        this.value.set(value);
    }

    public int getValue() {
        return value.get();
    }

    public int getISSUED_SHARES() {
        return ISSUED_SHARES;
    }

}
