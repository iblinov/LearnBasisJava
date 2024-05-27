package edu.itacademy.first.entity;

import java.util.Objects;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Ball ball = (Ball) o;

    if (radius != ball.radius) return false;
    if (Double.compare(weight, ball.weight) != 0) return false;
    if (!Objects.equals(material, ball.material)) return false;
    return Objects.equals(color, ball.color);
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = radius;
    result = 31 * result + (material != null ? material.hashCode() : 0);
    result = 31 * result + (color != null ? color.hashCode() : 0);
    temp = Double.doubleToLongBits(weight);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
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
