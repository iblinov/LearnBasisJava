package com.epam.learn.entity;

public class ItemMain {
  public static void main(String[] args) {
    Item i1 = new Item(77, "A");
    System.out.println(i1.itemId() + " " + i1.name() + " " + i1);
    Item i2 = new Item(77, "A");
    System.out.println((i1==i2) + " " + i1.equals(i2) + " " + (i1.hashCode() == i2.hashCode()) );
  }
}
