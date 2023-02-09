package com.epam.thread;

import java.util.ArrayDeque;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoArrayDeque {
  static ArrayDeque<String> arrayDeque = new ArrayDeque<>();
  static {
    arrayDeque.add("a");
    arrayDeque.add("b");
    arrayDeque.add("c");
  }
  static Lock locker = new ReentrantLock();
  static Condition condition = locker.newCondition();
  static String get(){
    locker.lock();
    String s;
    while ((s = arrayDeque.poll()) ==null) {
      condition.awaitUninterruptibly();
    }
    System.out.println(s);
    locker.unlock();
    return s;
  }
  static void release(String s) {
    locker.lock();
    arrayDeque.add(s);
    condition.signal();
    locker.unlock();
  }
  public static void main(String[] args) {
    Thread t = new Thread(()-> {
      String s = get();
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      release(s);
    });
    ExecutorService service = Executors.newFixedThreadPool(10);
    for (int i = 0; i < 10; i++) {
      service.execute(t);
    }
    service.shutdown();
  }
}
