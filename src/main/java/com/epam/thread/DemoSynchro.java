package com.epam.thread;

import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Pack {
 private ArrayDeque<String> arrayDeque = new ArrayDeque<>();
  {
    arrayDeque.add("a");
    arrayDeque.add("b");
    arrayDeque.add("c");
  }
  public  String get() {
    String s;
    while ((s = arrayDeque.poll()) == null) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        //log
      }
    }
    System.out.println(s);
    return s;
  }
  public  void release(String s) {
    arrayDeque.add(s);
    this.notify();
  }
}
public class DemoSynchro {
  public static void main(String[] args) {
    Pack pack = new Pack();
    Thread t = new Thread(() -> {
      String s = pack.get();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      pack.release(s);
    });
    ExecutorService service = Executors.newFixedThreadPool(6);
    for (int i = 0; i < 6; i++) {
      service.execute(t);
    }
    service.shutdown();
  }
}

