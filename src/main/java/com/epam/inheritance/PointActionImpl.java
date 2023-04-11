package com.epam.inheritance;

import com.epam.inheritance.AbstractPoint;
import com.epam.inheritance.PointAction;

public class PointActionImpl implements PointAction {
  @Override
  public void demo(AbstractPoint point) {
    double result = point.distance();
    System.out.println(result);
  }
}
