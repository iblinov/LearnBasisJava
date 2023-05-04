package com.epam.lines.main;

import com.epam.lines.model.Line;
import com.epam.lines.service.impl.LineServiceImpl;

public class LineApplication {
  public static void main(String[] args) {
    Line line = new Line();
    line.setX1(-5);
    line.setX2(8);
    System.out.println(line);
    Line line1 = new Line(1, 3, 5, 7);
    System.out.println(line1);
    Line line2 = new Line(0, 0, 3, 4);
    LineServiceImpl service = new LineServiceImpl();
    double actual = service.findLength(line2);
    System.out.println(actual);

  }
}
