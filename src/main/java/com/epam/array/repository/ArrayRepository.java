package com.epam.array.repository;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.spec.Specification;


import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Predicate;

public class ArrayRepository implements Repository<CustomArray> {
  private List<CustomArray> customArrays;

  public ArrayRepository(List<CustomArray> customArrays) {
    this.customArrays = customArrays;
  }

  @Override
  public boolean add(CustomArray array) {
    return customArrays.add(array);
  }

  @Override
  public boolean remove(CustomArray o) {
    return customArrays.remove(o);
  }

  @Override
  public CustomArray get(int index) {
    return customArrays.get(index);
  }

  @Override
  public CustomArray set(int index, CustomArray element) {
    return customArrays.set(index, element);
  }

  @Override
  public void add(int index, CustomArray element) {
    customArrays.add(index, element);
  }

  @Override
  public CustomArray remove(int index) {
    return customArrays.remove(index);
  }

  @Override
  public List<CustomArray> getCustomArrays() {
    return customArrays;
  }

  @Override
  public void setCustomArrays(List<CustomArray> customArrays) {
    this.customArrays = customArrays;
  }

  @Override
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
  public List<CustomArray> queryStream(Specification specification) {
    List<CustomArray> results =
         customArrays.stream()
                 .filter(array -> specification.specify(array))
                 .toList();
    return results;
  }

  @Override
  public List<CustomArray> queryPredicate(Predicate<CustomArray> predicate) {
    List<CustomArray> results =
            customArrays.stream()
                    .filter(predicate)
                    .toList();
    return results;
  }
  @Override
  public String toString() {
    return new StringJoiner(", ", ArrayRepository.class.getSimpleName() + "[", "]")
            .add("customArrays=" + customArrays)
            .toString();
  }
}
