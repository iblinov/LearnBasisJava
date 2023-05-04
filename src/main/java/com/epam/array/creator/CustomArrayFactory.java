package com.epam.array.creator;

import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CustomArrayFactory {
  public static CustomArray createCustomArray(int[] array) throws CustomException {
    if(array == null) {
      throw new CustomException("msg");
    }
    CustomArray customArray = new CustomArray(array);
    return customArray;
  }

  public static List<CustomArray> createCustomArray(List<int[]> array) {
    List<CustomArray> list = new ArrayList<>();
    // for
    return list;
  }

  public static Supplier<CustomArray> create(int[] array) {
    return () -> new CustomArray(array);
  }
}
