package com.epam.array.service.learn.operator;

public class WhileMain {
  public static void main(String[] args) {
    var d = 10.;
    var delta = 0.5;
    while(d > delta) {
      d /= 2;
      System.out.println(d);
    }
  }
}
