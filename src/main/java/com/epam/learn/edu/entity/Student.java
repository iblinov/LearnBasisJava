package com.epam.learn.edu.entity;

import java.util.StringJoiner;

public class Student {
  static final int MIN_SIZE_NAME = 4;
  static final int MAX_SIZE_NAME = 19;

  private String name;
  private double averageMark;
  private Ingredient type;

  public Student(String name, double averageMark, Ingredient type) {
   setName(name);
    this.averageMark = averageMark;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if(MIN_SIZE_NAME <= name.length() && name.length() <= MAX_SIZE_NAME) {
      this.name = name;
    } else {
      this.name = "John Doe";
    }
  }

  public double getAverageMark() {
    return averageMark;
  }

  public void setAverageMark(double averageMark) {
    this.averageMark = averageMark;
  }

  public Ingredient getType() {
    return type;
  }

  public void setType(Ingredient type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("averageMark=" + averageMark)
            .add("type=" + type)
            .toString();
  }
}
