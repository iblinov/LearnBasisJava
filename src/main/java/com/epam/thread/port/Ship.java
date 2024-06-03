package com.epam.thread.port;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Ship extends Thread {
  private int shipId;
  private ShipAction action;
  private int containers;
  private final int maxCapacity;

  public Ship(int shipId, ShipAction action, int containers, int maxCapacity) {
    this.shipId = shipId;
    this.action = action;
    this.containers = containers;
    this.maxCapacity = maxCapacity;
  }

  @Override
  public void run() {
    Berth berth = Port.getInstance().getBerth();
    System.out.println("Ship " + shipId + " started. in Berth =" +berth.getBerthId());
    try {
      TimeUnit.MILLISECONDS.sleep(1000+new Random().nextInt(4000));
      Port.currentNumberContainers.addAndGet(-containers);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      System.out.println("Ship " + shipId + " ended. with Berth =" + berth.getBerthId());
      Port.getInstance().releaseBerth(berth);
    }
  }
}
