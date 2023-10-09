package com.epam.thread.port;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Port {
  private static Port port;
  private ArrayDeque<String> pierses;
  private static Lock lock = new ReentrantLock(true);
  private static AtomicBoolean isCreated = new AtomicBoolean(false);
  private Port() {
      pierses = new ArrayDeque<>(10);
      //creating pier... & add
  }
  public static Port getInstance() {
    if (port == null) {
      try {
        lock.lock();
        if(!isCreated.get()) {
          port = new Port();
          isCreated.set(true);
        }
      } finally {
        lock.unlock();
      }
    }
    return port;
  }
  public String getPier() {
    String str = null;
    lock.lock();
    try {
      // empty check
       str = pierses.poll();
    } finally {
      lock.unlock();
    }
    return str;
  }
  public boolean releasePier(String pier) {
    pierses.push(pier);
    return true;
  }
}