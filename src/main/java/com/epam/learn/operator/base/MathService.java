package com.epam.learn.operator.base;

public class MathService {
  public byte method(byte x) {
    if (x < -42 || x > 42) {
      throw new IllegalArgumentException("fail x= " + x);
    }
    return (byte) (3 * x + 1);
  }
}
