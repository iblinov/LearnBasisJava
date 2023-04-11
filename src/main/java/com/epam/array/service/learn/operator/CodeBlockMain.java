package com.epam.array.service.learn.operator;

public class CodeBlockMain {
  public static void main(String[] args) {
    int a = 1;
    {
      int b = 5;
      a++;
      System.out.println(a);
    }
    //System.out.println(b);
    if(a == 1) {
      int c = 10;
    } else {
    //  c++;
    }
  }
}
