package com.epam.learn.operator.base;

public class Main {
  public static void main(String[] args) {
    MathService mathService = new MathService();
    System.out.println(mathService.method((byte)43));
  }
}
