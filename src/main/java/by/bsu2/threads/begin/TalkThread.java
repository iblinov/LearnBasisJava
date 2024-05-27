package by.bsu2.threads.begin;

import java.util.concurrent.TimeUnit;

public class TalkThread extends Thread {
    @Override
    public void run() {
            try {
                for (int i=0;i<2; i++) {
                    System.out.println("talk " +i);
                    TimeUnit.MILLISECONDS.sleep(5);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
    }
}
