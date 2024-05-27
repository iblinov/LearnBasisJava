package by.bsu2.threads.begin;

import java.util.concurrent.TimeUnit;

public class WalkRunnable implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=0;i<10; i++) {
                System.out.println("walk");
                TimeUnit.MILLISECONDS.sleep(5);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
