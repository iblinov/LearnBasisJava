package com.epam.thread;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DemoArrayDequeReadWrite {
  static ArrayDeque<StringBuilder> arrayDeque = new ArrayDeque<>();

  static {
    arrayDeque.add(new StringBuilder("a"));
    arrayDeque.add(new StringBuilder("b"));
    arrayDeque.add(new StringBuilder("c"));
  }

  static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  static final Lock readLock = lock.readLock();
  static final Lock writeLock = lock.writeLock();
  static final Condition writeCondition = writeLock.newCondition();


  static int counter = 0;

  static StringBuilder getAndRead() {
    readLock.lock();
    System.out.println(Thread.currentThread().getName() + " " + "read start");
    StringBuilder sb = null;
    while ((sb = arrayDeque.poll()) == null) {
      writeCondition.awaitUninterruptibly(); // FIXME: 2/9/2023
    }
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      //log
    }
    System.out.println(Thread.currentThread().getName() + " " + "read end " + sb);
    readLock.unlock();
    return sb;
  }

  static StringBuilder getAndChange() {
    writeLock.lock();
    System.out.println(Thread.currentThread().getName() + " " + "write start");
    StringBuilder sb = null;
    while ((sb = arrayDeque.poll()) == null) {
      writeCondition.awaitUninterruptibly();
    }
    try {
      Thread.sleep(new Random().nextInt(500));
    } catch (InterruptedException e) {
      //log
    }
    sb.append(++counter + " ");
    System.out.println(Thread.currentThread().getName() + " " + "write end " + sb);
    writeLock.unlock();
    return sb;
  }

  static void releaseWrite(StringBuilder s) {
    writeLock.lock();
    arrayDeque.add(s);
    writeCondition.signal();
    writeLock.unlock();
  }

  public static void main(String[] args) {
    Thread t0 = new Thread(() -> {
      int choice = new Random().nextInt(2);
      StringBuilder s = null;
      try {
        if (choice == 0) {
          s = getAndChange();
          Thread.sleep(100);
          releaseWrite(s);
        } else {
          s = getAndRead();
        }
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    });
    ExecutorService service = Executors.newFixedThreadPool(20);
    for (int i = 0; i < 20; i++) {
      service.execute(t0);
    }
    service.shutdown();
  }
}

