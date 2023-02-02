package com.epam.array.repository.spec;

import com.epam.array.entity.CustomArray;

public class IdSpecificationPredicate implements SpecificationPredicate{
  private int id;

  public IdSpecificationPredicate(int id) {
    this.id = id;
  }
  @Override
  public boolean test(CustomArray array) {
    return array.getArrayId() == id;
  }
}
