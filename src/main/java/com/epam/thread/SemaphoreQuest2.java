package com.epam.thread;

import java.util.Random;
import java.util.concurrent.Semaphore;
public class SemaphoreQuest2 {
  public static void main(String[] args) {
    Semaphore s = new Semaphore(3);
    new Thread(() -> exec(s), "A").start();
    new Thread(() -> exec(s), "B").start();
    new Thread(() -> exec(s), "C").start();
    new Thread(() -> exec(s), "D").start();
    new Thread(() -> exec(s), "E").start();
    new Thread(() -> exec(s), "F").start();
    new Thread(() -> exec(s), "H").start();

  }
  private static void exec(Semaphore s) {
    try {
      s.acquire();
      System.out.print(Thread.currentThread().getName() + "0 ");
  //    Thread.sleep(new Random().nextInt(2000) +1000);
    } catch (InterruptedException e) {
    } finally {
      System.out.print(Thread.currentThread().getName() + "1 ");
      s.release();
    }
  }
}

