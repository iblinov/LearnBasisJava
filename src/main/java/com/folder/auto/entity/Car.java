package com.folder.auto.entity;

import java.util.StringJoiner;

public class Car {
  private int carId;
  private String mark;
  private String model;
  private int year;
  private String colour;
  private double price;
  private String regNumber;

  public Car() {
  }

  public Car(int carId, String mark, String model, int year, String colour, double price, String regNumber) {
    this.carId = carId;
    this.mark = mark;
    this.model = model;
    this.year = year;
    this.colour = colour;
    this.price = price;
    this.regNumber = regNumber;
  }

  public int getCarId() {
    return carId;
  }

  public void setCarId(int carId) {
    this.carId = carId;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
            .add("carId=" + carId)
            .add("mark='" + mark + "'")
            .add("model='" + model + "'")
            .add("year=" + year)
            .add("colour='" + colour + "'")
            .add("price=" + price)
            .add("regNumber='" + regNumber + "'")
            .toString();
  }
}
