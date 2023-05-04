package com.epam.lines.service.impl;

import com.epam.lines.model.Line;
import com.epam.lines.service.LineService;

public class LineServiceImpl implements LineService {
  public double findLength(Line line) {
    int dx = line.getX1() - line.getX2();
    int dy = line.getY1() - line.getY2();
    return Math.hypot(dx, dy);
  }
}
