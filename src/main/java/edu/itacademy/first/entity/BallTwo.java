package edu.itacademy.first.entity;

public class BallTwo {
  private int radius;
  private String material;
  private Color color;
  private double weight;
  private String name;

  public BallTwo() {
  }

  public BallTwo(int radius, String material, Color color, double weight) {
    this.radius = radius;
    this.material = material;
    this.color = color;
    this.weight = weight;
  }

  public BallTwo(int radius, String material, Color color, double weight, String name) {
    this.radius = radius;
    this.material = material;
    this.color = color;
    this.weight = weight;
    this.name = name;
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

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("BallTwo{");
    sb.append("radius=").append(radius);
    sb.append(", material='").append(material).append('\'');
    sb.append(", color=").append(color);
    sb.append(", weight=").append(weight);
    sb.append(", name='").append(name).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
