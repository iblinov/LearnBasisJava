package com.epam.learn.cube.factory;

import com.epam.learn.cube.entity.Shape;

public abstract class ShapeFactory {
  public abstract Shape create(double ... params);
}
