package com.epam.thread;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DemoStringBuilderReadWrite {
  static ArrayDeque<StringBuilder> arrayDeque = new ArrayDeque<>();
  static {
    arrayDeque.add(new StringBuilder("a"));
    arrayDeque.add(new StringBuilder("b"));
    arrayDeque.add(new StringBuilder("c"));
  }
  static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  static final Lock readLock = lock.readLock();
  static final Lock writeLock = lock.writeLock();
  static int counter = 0;
  static StringBuilder getAndRead(){
    readLock.lock();
    System.out.println(Thread.currentThread().getName() + " " + "read start");
    StringBuilder sb = arrayDeque.element();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    while ((s = arrayDeque.poll()) ==null) {
//      condition.awaitUninterruptibly();
//    }
    System.out.println(Thread.currentThread().getName() + " " + "read end " + sb);
    readLock.unlock();
    return sb;
  }
  static StringBuilder getAndChange(){
    writeLock.lock();
    System.out.println(Thread.currentThread().getName() + " " + "write start");
    StringBuilder sb = arrayDeque.element();
    try {
      Thread.sleep(new Random().nextInt(500));
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
//    while ((s = arrayDeque.poll()) ==null) {
//      condition.awaitUninterruptibly();
//    }
    sb.append(++counter + " ");
    System.out.println(Thread.currentThread().getName() + " " + "write end " + sb);
    writeLock.unlock();
    return sb;
  }
//  static void release(String s) {
//    locker.lock();
//    arrayDeque.add(s);
//    condition.signal();
//    locker.unlock();
//  }
  public static void main(String[] args) {
    Thread t0 = new Thread(()-> {
     int choice = new Random().nextInt(2);
      StringBuilder s = null;
     if (choice == 0) {
       s = getAndChange();
     } else {
       s = getAndRead();
     }
//      try {
//        Thread.sleep(100);
//      } catch (InterruptedException e) {
//        Thread.currentThread().interrupt();
//      }
    //  release(s);
    });

    ExecutorService service = Executors.newFixedThreadPool(20);
    for (int i = 0; i < 20; i++) {
      service.execute(t0);
    }
    service.shutdown();
  }
}
