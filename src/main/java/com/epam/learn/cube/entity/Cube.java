package com.epam.learn.cube.entity;

public class Cube extends Shape {
   private int cubeId;
   private int side;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cube cube = (Cube) o;

    if (cubeId != cube.cubeId) return false;
    return side == cube.side;
  }

  @Override
  public int hashCode() {
    int result = cubeId;
    result = 31 * result + side;
    return result;
  }
}


