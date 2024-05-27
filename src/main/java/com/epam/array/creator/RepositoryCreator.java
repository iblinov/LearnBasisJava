package com.epam.array.creator;

import com.epam.array.entity.CustomArray;
import com.epam.array.repository.Repository;

import java.util.List;

public interface RepositoryCreator {
  Repository createFromListObject(List<CustomArray> customArrayList);
  Repository createFromListArray(List<int[]> arraysList);
}
