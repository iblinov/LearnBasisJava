package com.epam.inheritance;

import java.util.StringJoiner;

public class Point3D extends Point2D{
  private int z;

  public Point3D() {
  }

  public Point3D(int z) {
    this.z = z;
  }

  public Point3D(long pointId, int x, int y, int z) {
    super(pointId, x, y);
    this.z = z;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  @Override
  public double distance() {
    return Math.hypot(super.distance(), z);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", "[", "]")
            .add("y=" + getY())
            .add("z=" + z)
            .toString();
  }
}
