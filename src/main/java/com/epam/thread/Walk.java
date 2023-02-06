package com.epam.thread;

public class Walk extends Thread {
  public void run() {
    try {
      for (int i = 0; i < 7; i++) {
        System.out.println("Walk " + i);
        try {
          Thread.sleep(0);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    } finally {
      System.out.println("Walk   "+Thread.currentThread().getName());
    }
  }
}

