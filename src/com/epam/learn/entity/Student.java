package com.epam.learn.entity;

public class Student extends Person {
  private double averageMark;

  public Student(int personId, String lastname, double averageMark) {
    super(personId, lastname);
    this.averageMark = averageMark;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Student{");
    sb.append(super.toString()).append("averageMark=").append(averageMark);
    sb.append('}');
    return sb.toString();
  }
}
