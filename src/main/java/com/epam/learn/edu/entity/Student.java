package com.epam.learn.edu.entity;

import java.util.StringJoiner;

public class Student {
  private String name;
  private double averageMark;

  public Student() {
  }

  public Student(String name, double averageMark) {
    this.name = name;
    this.averageMark = averageMark;


  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMark() {
    return averageMark;
  }

  public void setAverageMark(double averageMark) {
    this.averageMark = averageMark;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("averageMark=" + averageMark)
            .toString();
  }
}
