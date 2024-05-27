package com.epam.array.repository;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.spec.Specification;

import java.util.List;
import java.util.function.Predicate;

public interface Repository<E> {
  boolean add(E element);

  boolean remove(E o);

  E get(int index);

  E set(int index, E element);

  void add(int index, E element);

  CustomArray remove(int index);

  List<CustomArray> getCustomArrays();

  void setCustomArrays(List<CustomArray> customArrays);

  List<CustomArray> query(Specification specification);

  List<CustomArray> queryStream(Specification specification);

  List<CustomArray> queryPredicate(Predicate<CustomArray> predicate);

  @Override
  String toString();
}
