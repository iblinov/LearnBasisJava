package by.bsu.race;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Race {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDown = new CountDownLatch(3);
        int trackLength = 500;
        for (int i = 1; i <= 5; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50), trackLength, countDown)).start();
            TimeUnit.MILLISECONDS.sleep(500);
        }

        TimeUnit.SECONDS.sleep(1);
        System.out.println("На старт!");
        countDown.countDown();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Внимание!");
        countDown.countDown();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Марш!");
        countDown.countDown();
    }
}
