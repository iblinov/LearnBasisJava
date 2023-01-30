package com.epam.array.creator;

import com.epam.array.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreator {
 public CustomArray createCustomArray(int[] array) {
   CustomArray customArray = new CustomArray(array);
   return customArray;
 }
 public List<CustomArray> createCustomArray(List<int[]> array) {
  List<CustomArray> list = new ArrayList<>();
  ///
   return list;
 }
}
