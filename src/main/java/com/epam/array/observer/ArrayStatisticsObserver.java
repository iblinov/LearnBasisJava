package com.epam.array.observer;

import com.epam.array.entity.CustomArray;

public interface ArrayStatisticsObserver {
  void changeArrayElement(CustomArray array);
}
