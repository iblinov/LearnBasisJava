package com.epam.lines.model;

import java.util.StringJoiner;

public class Line {
  private int x1;
  private int y1;
  private int x2;
  private int y2;

  public Line() {
  }

  public Line(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  public int getX1() {
    return x1;
  }

  public void setX1(int x1) {
    if (x1 >= 0) {
      this.x1 = x1;
    }
  }

  public int getY1() {
    return y1;
  }

  public void setY1(int y1) {
    this.y1 = y1;
  }

  public int getX2() {
    return x2;
  }

  public void setX2(int x2) {
    this.x2 = x2;
  }

  public int getY2() {
    return y2;
  }

  public void setY2(int y2) {
    this.y2 = y2;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Line.class.getSimpleName() + "[", "]")
            .add("x1=" + x1)
            .add("y1=" + y1)
            .add("x2=" + x2)
            .add("y2=" + y2)
            .toString();
  }
}
