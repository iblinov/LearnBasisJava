package com.epam.inheritance;

import java.util.Comparator;

public enum Point2DComparator implements Comparator<Point2D> {
  X {
    @Override
    public int compare(Point2D o1, Point2D o2) {
      return o1.getX() - o2.getX();
    }
  }, Y {
    @Override
    public int compare(Point2D o1, Point2D o2) {
      return o1.getY() - o2.getY();
    }
  };
}
class Main{
  public static void main(String[] args) {
    Point2DComparator xComp = Point2DComparator.X;
    Point2D p1 = new Point2D(1, 100, 0);
    Point2D p2 = new Point2D(2, 90, 20);
    System.out.println(xComp.compare(p1, p2));
    System.out.println(xComp.compare(p1, p1));
    System.out.println(xComp.compare(p2, p1));

  }
}