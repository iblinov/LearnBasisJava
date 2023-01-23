package com.epam.array.repository.spec;

import com.epam.array.entity.CustomArray;

public class IdSpecification implements Specification{
  private int id;

  public IdSpecification(int id) {
    this.id = id;
  }

  @Override
  public boolean specify(CustomArray array) {
    return array.getArrayId() == id;
  }
}
