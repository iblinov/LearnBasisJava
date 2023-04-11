package com.epam.array.service.learn.operator;

public class DoWhile {
  public static void main(String[] args) {
    var number = 10;
    do {
      number /= 2;
      System.out.println(number);
    } while (number > 1);
  }
}
