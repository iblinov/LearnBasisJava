package com.epam.learn.edu.entity;

import java.util.Comparator;
import java.util.StringJoiner;

public class Student {
  static final int MIN_SIZE_NAME = 4;
  static final int MAX_SIZE_NAME = 19;
  public static String faculty = "MMF";
  private String name;
  private double averageMark;

  public Student(String name, double averageMark) {
    setName(name);
    Student.this.averageMark = averageMark;
  }
  public static class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
      return o1.getName().compareTo(o2.getName());
    }
  }
  public  Student(String name) {
    this.name = name;
  }

  public Student() {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (Double.compare(averageMark, student.averageMark) != 0) return false;
    if (name != null ? !name.equals(student.name) : student.name != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = name != null ? name.hashCode() : 0;
    temp = Double.doubleToLongBits(averageMark);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
            .add("name='" + name + "'")
            .add("averageMark=" + averageMark)
            .toString();
  }
}
