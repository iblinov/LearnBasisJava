package by.bsu2.java8.copyonwritearray;

import java.util.concurrent.TimeUnit;

public class CopyOnWriteArraySetDemo{

    public static void main(String args[]) {

        Publisher cricNext = new Publisher();

        SubScriber raj = new SubScriber("RAJ");
        SubScriber adom = new SubScriber("ADOM");

      new Thread(()-> cricNext.addSubscriber(raj)).start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cricNext.notifySubs("FOUR");
        new Thread(()-> cricNext.addSubscriber(adom)).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cricNext.notifySubs("SIX");

    }

}
