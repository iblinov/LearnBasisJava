package com.epam.learn.gift2.entity;

public enum SweetType {
  CHOCOLAD(8),
  CHUPA_CHUPS(1);

  SweetType(int price) {
    this.price = price;
  }

  private int price;

  public int getPrice() {
    return price;
  }
}
