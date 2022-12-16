package com.epam.learn.entity;

public class BusMain {
  public static void main(String[] args) {
    Bus bus1 = new Bus(11);
    Bus bus2 = new Bus(21);
    System.out.println(bus1);
    System.out.println(bus2);
    Bus bus3 = new Bus();
    Bus bus4 = new Bus();
    System.out.println(bus3);
    System.out.println(bus4);
  }
}
