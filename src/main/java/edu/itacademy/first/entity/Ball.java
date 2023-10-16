package edu.itacademy.first.entity;

import java.util.StringJoiner;

public class Ball {
  private static final int MIN_RADIUS_SM = 100;
  private static final int MAX_RADIUS_SM = 500;
  private int radius;
  private String material;
  private String color;
  private double weight;

  public Ball(int radius, String material, String color, double weight) {
    this.radius = radius;
    this.material = material;
    this.color = color;
    this.weight = weight;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return new StringJoiner("; ", Ball.class.getSimpleName() + "(", ")")
            .add("radius=" + radius)
            .add("material='" + material + "'")
            .add("color='" + color + "'")
            .add("weight=" + weight)
            .toString();
  }
}
