package com.epam.array.service;


import java.util.OptionalInt;

public class Main {
  public static void main(String[] args) {
    Service service = new Service();
    OptionalInt res = service.area(5);
  //  System.out.println(res.getAsInt());
    if(res.isPresent()) {
      System.out.println(res.getAsInt());
    }
    res.ifPresent(n -> System.out.println(Math.pow(n, 2)));
    System.out.println(res.orElse(-1));
  }
}
