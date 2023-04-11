package com.epam.array.service.learn.datatype;

public class CastTypeMain {
  public static void main(String[] args) {
    byte b = 1;
    short s = 200;
    int i = 3;
    long l = 4;
    float f = 1.9f;
    double d = 2.5;
    boolean bool = true;
    char ch = 'A';
    s = b;
    b = (byte) s;
    i = (int)f;
    i = ch;
    System.out.println(i);
  }
}
