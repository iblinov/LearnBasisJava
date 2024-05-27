package by.bsu.race;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
    private int carNumber;
    private int carSpeed;
    private int trackLength;
    private CountDownLatch start;

    public Car(int carNumber, int carSpeed, int trackLength, CountDownLatch start) {
        this.carNumber = carNumber;
        this.carSpeed = carSpeed;
        this.trackLength = trackLength;
        this.start = start;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
            start.await();
            TimeUnit.SECONDS.sleep(trackLength/carSpeed);
            System.out.printf("Автомобиль №%d финишировал!\n", carNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}