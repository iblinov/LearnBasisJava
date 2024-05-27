package com.epam.thread.port;

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
      TimeUnit.MILLISECONDS.sleep(300);
      Port.currentNumberContainers.addAndGet(-containers);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      Port.getInstance().releaseBerth(berth);
    }
    System.out.println("Ship " + shipId + " ended. with Berth =" + berth.getBerthId());
  }
}
