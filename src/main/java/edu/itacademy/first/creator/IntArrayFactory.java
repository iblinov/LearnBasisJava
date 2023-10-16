package edu.itacademy.first.creator;

import java.util.Random;

public class IntArrayFactory {
  public static int[] createArray(int size) {
    int[] nums = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      nums[i] = random.nextInt();
    }
    return nums;
  }
  public static int[] createBoundArray(int size, int origin, int bound) {
    int[] nums = new int[size];
    Random random = new Random();
    for (int i = 0; i < size; i++) {
      nums[i] = random.nextInt(origin, bound);
    }
    return nums;
  }
}
