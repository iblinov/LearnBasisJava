package com.epam.inheritance;

public class PointMain {
  public static void main(String[] args) {
    PointAction action = new PointActionImpl();
    Point1D p1 = new Point1D(1, 10);
    action.demo(p1);
    Point2D p2 = new Point2D(100, 3, 4);
    action.demo(p2);
    Point3D p3 = new Point3D(101, 3, 4, 12);
    action.demo(p3);
  }
}
