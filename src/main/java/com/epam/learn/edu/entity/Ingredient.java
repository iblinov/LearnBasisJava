package com.epam.learn.edu.entity;

public enum Ingredient {
  TOMATO(1.0),
  GARLIC(1.5);

  Ingredient(double price) {
    this.price = price;
  }

  private double price;

  public double getPrice() {
    return price;
  }
}
