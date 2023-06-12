package com.epam.learn.operator;

public class ForMain {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    for(int element : array) {
      System.out.println(element);
      if (element > 3) {
        break;
      }
      System.out.println(element);
    }
  }
}
