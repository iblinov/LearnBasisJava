package com.epam.array.service.learn.edu.entity;

import com.epam.array.service.learn.edu.util.IdGenerator;

public class Base {
  public static final int MAX_RANGE = 10;
  public static final StringBuilder builder = new StringBuilder("2");
  private final int baseId = IdGenerator.generateNextId();
  private final int baseId0;
  private final int baseId1;

  //public final int value;
  {
    baseId1 = IdGenerator.generateNextId();
  }
  public Base(int baseId0) {
    this.baseId0 = baseId0;
  }

  public Base() {
    baseId0 = IdGenerator.generateNextId();
  }

  public int getBaseId() {
    return baseId;
  }

}
