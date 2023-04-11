package com.epam.array.service.learn.service;

public class ServiceMain {
  public static void main(String[] args) {
     BaseService service = new UpperService();
     String string = "java16";
    System.out.println(service.change(string));
    service = new CutService();
    System.out.println(service.change(string));
  }
}
