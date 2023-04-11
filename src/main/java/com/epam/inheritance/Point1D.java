package com.epam.inheritance;

import java.util.StringJoiner;

public sealed class Point1D extends AbstractPoint permits Point2D{
  private int x;

  public Point1D() {
  }

  public Point1D(long pointId, int x) {
    super(pointId);
    Point1D.this.x = x;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  @Override
  public double distance() {
    return Math.abs(x);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Point1D.class.getSimpleName() + "[", "]")
            .add("x=" + x)
            .toString();
  }
}
