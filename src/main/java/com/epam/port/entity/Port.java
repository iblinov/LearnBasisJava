package com.epam.port.entity;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {
  private static Port instance;
  private static Lock lock = new ReentrantLock(true);
  private static AtomicBoolean create = new AtomicBoolean(false);
  private ArrayDeque<Pier> piers = new ArrayDeque<>();
  private AtomicInteger portContainers = new AtomicInteger(1000);
  private Port() {
  }

  public static Port getInstance() {
    if(!create.get()) {
      lock.lock();
      try {
        if (instance == null) {
          instance = new Port();
          create.getAndSet(true);
        }
      } finally {
        lock.unlock();
      }
    }
    return instance;
  }
  public Pier getPier() {
    lock.lock();
    Pier pier;
    try{
       pier = piers.poll();
    } finally {
      lock.unlock();
    }
    return pier;
  }
  public void releasePier(Pier pier) {
    lock.lock();
    try{
     piers.add(pier);
    } finally {
      lock.unlock();
    }
  }
  public int load(int container) {
    //
    portContainers.addAndGet(-container);
    //
    return container;
  }
  public int unload(int container) {
    //
    portContainers.addAndGet(container);
    //
    return container;
  }
}
