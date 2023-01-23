package com.epam.array.repository;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.spec.Specification;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayRepository {
  private List<CustomArray> customArrays;

  public ArrayRepository(List<CustomArray> customArrays) {
    this.customArrays = customArrays;
  }

  public List<CustomArray> getCustomArrays() {
    return customArrays;
  }

  public void setCustomArrays(List<CustomArray> customArrays) {
    this.customArrays = customArrays;
  }

  public List<CustomArray> query(Specification specification) {
    List<CustomArray> results = new ArrayList<>();
    for (CustomArray array : customArrays) {
      if (specification.specify(array)) {
        results.add(array);
      }
    }
    return results;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
            .add("customArrays=" + customArrays)
            .toString();
  }
}
