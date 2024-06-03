package com.epam.thread.port;

import java.util.TimerTask;

public class Train extends TimerTask {
  private static final double LOAD_FACTOR = .75;
  public static final int CHECK_INTERVAL = 400;
  private static final double TRAIN_CAPACITY = .2 * Port.MAX_CAPACITY;
  @Override
  public void run() {
     if(Port.currentNumberContainers.get() > LOAD_FACTOR * Port.MAX_CAPACITY) {
       Port.currentNumberContainers.addAndGet(-1 * (int)TRAIN_CAPACITY);
     }
    if(Port.currentNumberContainers.get() < (1 - LOAD_FACTOR) * Port.MAX_CAPACITY) {
      Port.currentNumberContainers.addAndGet((int)TRAIN_CAPACITY);
      System.out.println(Port.currentNumberContainers + " after check");
    }

  }
}
