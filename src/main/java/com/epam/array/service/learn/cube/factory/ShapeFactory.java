package com.epam.array.service.learn.cube.factory;

import com.epam.array.service.learn.cube.entity.Shape;

public abstract class ShapeFactory {
  public abstract Shape create(double ... params);
}
