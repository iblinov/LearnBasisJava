package com.epam.array.repository;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.spec.Specification;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;

public class ArrayRepository {
  private List<CustomArray> customArrays;

  public boolean add(CustomArray customArray) {
    return customArrays.add(customArray);
  }

  public boolean remove(CustomArray array) {
    return customArrays.remove(array);
  }

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
  public List<CustomArray> queryStream(Specification specification) {
    List<CustomArray> results =
         customArrays.stream().filter(array -> specification.specify(array)).toList();
    return results;
  }

  public List<CustomArray> queryPredicate(Predicate<CustomArray> predicate) {
    List<CustomArray> results =
            customArrays.stream().filter(predicate).toList();
    return results;
  }
  @Override
  public String toString() {
    return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
            .add("customArrays=" + customArrays)
            .toString();
  }
}
