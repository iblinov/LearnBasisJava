package com.epam.learn.cube.repository;

import com.epam.learn.cube.entity.Cube;

import java.util.ArrayList;
import java.util.List;

public class CubeRepository {
  private List<Cube> cubes = new ArrayList<>();

  public boolean add(Cube cube) {
    return cubes.add(cube);
  }

  public boolean remove(Object o) {
    return cubes.remove(o);
  }

  public Cube get(int index) {
    return cubes.get(index);
  }
}
