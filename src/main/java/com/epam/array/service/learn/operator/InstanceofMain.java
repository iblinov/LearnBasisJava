package com.epam.array.service.learn.operator;


public class InstanceofMain {
  public static void main(String[] args) {
    Object object = "ABC";
    if(object instanceof String str) {
      str = str.toUpperCase();
      System.out.println(str);
    } else {
      System.out.println(object);
    }
  }
}
