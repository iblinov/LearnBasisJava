package com.epam.learn.operator;

public class SwitchMain {
  public static void main(String[] args) {
    int number = 3;
    switch (number) {
      case 1 -> number *= 2;
      case 2 -> number *= 3;
      case 3 -> number *= 4;
      case 4 -> number *= 5;
      default -> {
        System.out.println("out of range");
        number += 100;
      }
    }
    System.out.println(number);
  }
}
