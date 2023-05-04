package com.epam.array.main;

import com.epam.array.creator.CustomArrayFactory;
import com.epam.array.entity.CustomArray;
import com.epam.array.exception.CustomException;
import com.epam.array.reader.ArrayReader;
import com.epam.array.reader.impl.ArrayReaderImpl;

import java.util.Arrays;
import java.util.function.Supplier;

public class ArrayMain {
  public static void main(String[] args) {
    ArrayReader reader = new ArrayReaderImpl();
    try {
      int[] nums = reader.readArray7("data\\arrays.txt");
      System.out.println(Arrays.toString(nums));
      CustomArray array = CustomArrayFactory.createCustomArray(nums);
      System.out.println(array);
      Supplier<CustomArray> array2 = CustomArrayFactory.create(nums);
      System.out.println(array2.get());
    } catch (CustomException e) {
      System.err.println(e);
    }
  }
}
