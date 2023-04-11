package com.epam.array.service.learn.edu.util;

public class IdGenerator {
  private static final int MIN_VALUE = 10;
  private static final int MAX_VALUE = 99;
  
  private static int orderId = MIN_VALUE;

  private IdGenerator() {
  }

  public static int generateNextId() {
    return orderId++;
  }
}
