package com.epam.thread.port;

import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.schedule(new Train(), 100, Train.CHECK_INTERVAL);
    int id = 100;
    //1
//    for (int i = 0; i < 30; i++) {
//      new Ship(++id, ShipAction.LOAD, 30, 70).start();
//    }
    //2
    ExecutorService service = Executors.newFixedThreadPool(30);
    for (int i = 0; i < 30; i++) {
      service.execute(new Ship(1, ShipAction.LOAD, 30, 70));
    }
    service.shutdown();
  }
}
