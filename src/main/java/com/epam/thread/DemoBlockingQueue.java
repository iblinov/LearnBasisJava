package com.epam.thread;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoBlockingQueue {
  static BlockingQueue<String> arrayDeque = new LinkedBlockingQueue<>();
  static {
    arrayDeque.add("a");
    arrayDeque.add("b");
    arrayDeque.add("c");
  }

  static String get() {
    String s = null;
    try {
      s = arrayDeque.take();
    } catch (InterruptedException e) {
      // log
    }
    System.out.println(s);
    return s;
  }

  static void release(String s) {
    arrayDeque.offer(s);
  }
  public static void main(String[] args) {
    Thread t = new Thread(() -> {
      String s = get();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      release(s);
    });
    ExecutorService service = Executors.newFixedThreadPool(6);
    for (int i = 0; i < 6; i++) {
      service.execute(t);
    }
    service.shutdown();
  }
}
