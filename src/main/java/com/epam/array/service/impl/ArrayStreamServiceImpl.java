package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.ArrayService;

import java.util.Arrays;

public class ArrayStreamServiceImpl implements ArrayService {
  @Override
  public int findMax(CustomArray array) {
    System.out.print("stream: ");
    return Arrays.stream(array.getArray())
            .max()
            .getAsInt();
  }

  @Override
  public int findMin(CustomArray array) {
    return 0;
  }
}
