package com.epam.inheritance;

import java.util.StringJoiner;

public non-sealed class Point2D extends Point1D {
  private int y;

  public Point2D() {
  }

  public Point2D(long pointId, int x, int y) {
    super(pointId, x);
    this.y = y;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public double distance() {
    return Math.hypot(super.distance(), y);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Point2D.class.getSimpleName() + "[", "]")
            .add("y=" + y)
            .toString();
  }
}
