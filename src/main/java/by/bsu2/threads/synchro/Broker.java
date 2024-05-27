package by.bsu2.threads.synchro;

import java.util.concurrent.TimeUnit;

public class Broker extends Thread {
    public static Market market;
    private static final int PAUSE = 500; // in millis

    public Broker() {
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: "
                        + market.getIndex());
                TimeUnit.MILLISECONDS.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

