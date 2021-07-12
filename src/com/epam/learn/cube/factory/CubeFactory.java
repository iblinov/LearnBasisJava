package com.epam.learn.cube.factory;

import com.epam.learn.cube.entity.Cube;
import com.epam.learn.cube.entity.Shape;

import java.util.ArrayList;
import java.util.List;

public class CubeFactory extends ShapeFactory{
  @Override
  public Cube create(double ... params) {
    ///
    return new Cube();
  }
  public List<Cube> create(double[] ... params) {
    //
    return new ArrayList<>();
  }
}
