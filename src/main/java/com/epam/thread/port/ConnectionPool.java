package com.epam.thread.port;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConnectionPool {

  private static ConnectionPool instance;
  private static CountDownLatch latch = new CountDownLatch(1);
  private static AtomicBoolean isInitialized = new AtomicBoolean(false);

  private ConnectionPool() {
  }

  public static ConnectionPool getInstance() {
    if (instance == null) {
      if (isInitialized.compareAndSet(false, true)) {
        instance = new ConnectionPool();
        latch.countDown();
      }
      try {
        latch.await();
      } catch (InterruptedException e) {
        // logger
      }
    }
    return instance;
  }
}

