package com.epam.thread.port;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {
  private static Port port;
  private ArrayDeque<Berth> berths;
  private static Lock lock = new ReentrantLock(true);
  private static Condition condition = lock.newCondition();
  private static AtomicBoolean isCreated = new AtomicBoolean(false);
  public static final AtomicInteger MAX_CAPACITY = new AtomicInteger(1_000);
  public static AtomicInteger currentNumberContainers;
  private Port() {
    berths = new ArrayDeque<>(5);
    int id = 1;
    for (int i = 0; i < 6; i++) {
      berths.push(new Berth(id++));
    }
    currentNumberContainers = new AtomicInteger(444);// random may be
  }

  public static Port getInstance() {
    if (port == null) {
      try {
        lock.lock();
        if (!isCreated.get()) {
          port = new Port();
          isCreated.set(true);
        }
      } finally {
        lock.unlock();
      }
    }
    return port;
  }

  public Berth getBerth() {
    Berth berth = null;
    lock.lock();
    try {
      if(berths.isEmpty()) {
        condition.await();
      }
      berth = berths.poll();
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      lock.unlock();
    }
    return berth;
  }

  public boolean releaseBerth(Berth berth) {
    lock.lock();
    try {
      berths.push(berth);
      condition.signal();
    } finally {
      lock.unlock();
    }
    return true;
  }
}