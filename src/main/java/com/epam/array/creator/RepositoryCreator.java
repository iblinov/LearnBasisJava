package com.epam.array.creator;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.ArrayRepository;

import java.util.List;

public interface RepositoryCreator {
  ArrayRepository createFromListObject(List<CustomArray> customArrayList);
  ArrayRepository createFromListArray(List<int[]> arraysList);
}
