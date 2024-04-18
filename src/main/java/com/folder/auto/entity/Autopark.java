package com.folder.auto.entity;

import java.util.Arrays;
import java.util.StringJoiner;

public class Autopark {
  private Car[] cars;

  public Autopark(Car[] cars) {
    this.cars = cars;
  }

  public Car[] getCars() {
    return cars;
  }

  public void setCars(Car[] cars) {
    this.cars = cars;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Autopark.class.getSimpleName() + "[", "]")
            .add("cars=" + Arrays.toString(cars))
            .toString();
  }
}
