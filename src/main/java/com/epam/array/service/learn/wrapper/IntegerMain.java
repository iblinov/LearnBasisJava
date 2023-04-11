package com.epam.array.service.learn.wrapper;

public class IntegerMain {
  public static void main(String[] args) {
//    Integer i = 1;
//    Integer i1 = 1;
//    System.out.println(i==i1);
//    Integer i2 = 128;
//    Integer i3 = 128;
//    System.out.println(i2==i3);
    int num = Integer.parseInt("15");
    int num2 = Integer.decode("0xf");
    int num3 = Integer.decode("017");
  //  System.out.println(num + " " + num2 + " " + num3);
    int num4 = Integer.valueOf("17");
    int num5 = Integer.valueOf("17", 8);
    System.out.println(num4 + " " + num5);
  }
}
