package com.epam.array.service.learn.operator;

public class TernaryMain {
  public static void main(String[] args) {
    int bonus = 0;
    int items = 10;
    bonus = items > 3 ? 25 : 1;
//    if (items > 3) {
//      bonus = 25;
//    }  else {
//      bonus = 1;
//    }
    System.out.println(bonus);
  }
}
