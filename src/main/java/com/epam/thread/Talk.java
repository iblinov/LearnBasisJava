package com.epam.thread;

public class Talk implements Runnable {
  @Override
  public void run() {
    try {
      for (int i = 0; i < 7; i++) {
        System.out.println("Talk -->" + i);
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    } finally {
      System.out.println("Talk   "+Thread.currentThread().getName());
    }
  }
}
