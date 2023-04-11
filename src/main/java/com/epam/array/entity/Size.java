package com.epam.array.entity;

import java.util.StringJoiner;

public enum Size {
  SMALL(3), MEDIUM(10), LARGE(25);
 private int value;

  Size(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Size.class.getSimpleName() + "[", "]")
            .add("value=" + value)
            .toString();
  }
}
