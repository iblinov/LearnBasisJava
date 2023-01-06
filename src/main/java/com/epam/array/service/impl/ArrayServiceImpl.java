package com.epam.array.service.impl;

import com.epam.array.entity.CustomArray;
import com.epam.array.service.ArrayService;

import java.util.Arrays;

public class ArrayServiceImpl implements ArrayService {
  public int findMax(CustomArray array) {
    int [] arr = array.getArray();
    int resMax = arr[0]; // Integer.MIN_VALUE;
    for (int value : arr) {
      if(value > resMax) {
        resMax = value;
      }
    }
    System.out.print("classic: ");
    return resMax;
  }
}
