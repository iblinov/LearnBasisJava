package com.epam.thread.exchange;

import java.util.concurrent.TimeUnit;

public class ExchangeMain {
  public static void main(String[] args) {
    ItemAction action = new ItemAction();
    Item o1 = new Item(101, 5.0, "Tie");
    Item o2 = new Item(171, 7.0, "Gloves");


    System.out.println(o1 + "\n" + o2);
    new Thread(() -> action.doActionPrice(o1, 0.9f)).start();
    new Thread(() -> action.doActionDescription(o2, " with discount")).start();
    try {
      TimeUnit.SECONDS.timedJoin(Thread.currentThread(), 1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(o1 + "\n" + o2);
  }

}
