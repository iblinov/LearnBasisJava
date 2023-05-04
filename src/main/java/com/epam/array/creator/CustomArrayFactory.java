package com.epam.array.creator;

import com.epam.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CustomArrayFactory {
  public static CustomArray createCustomArray(int[] array) {
    CustomArray customArray = new CustomArray(array);
    return customArray;
  }

  public static List<CustomArray> createCustomArray(List<int[]> array) {
    List<CustomArray> list = new ArrayList<>();
    return list;
  }

  public static Supplier<CustomArray> create(int[] array) {
    return () -> new CustomArray(array);
  }
}
