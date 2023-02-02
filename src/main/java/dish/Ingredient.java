package dish;

import java.util.StringJoiner;

public enum Ingredient {
  KALZONE(0.5, "Kalzone"), MAIS(0.7, "Mais"), PASTA(1, "Pasta");
  private double price;
  private String name;

  Ingredient(double price, String name) {
    this.price = price;
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return this.getName();
  }
}
