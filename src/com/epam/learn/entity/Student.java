package com.epam.learn.entity;


public class Student extends Person {
  private double averageMark;


  public Student(int personId, String lastname, double averageMark) {
    super(personId, lastname);
    this.averageMark = averageMark;
  }

  public static class StudentBuilder {
    private int personId;
    private String lastname;
    private double averageMark;

    public StudentBuilder setPersonId(int personId) {
      this.personId = personId;
      return this;
    }

    public StudentBuilder setLastname(String lastname) {
      this.lastname = lastname;
      return this;
    }

    public StudentBuilder setAverageMark(double averageMark) {
      this.averageMark = averageMark;
      return this;
    }

    public Student createStudent() {
      return new Student(personId, lastname, averageMark);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Student student = (Student) o;

    return Double.compare(student.averageMark, averageMark) == 0;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    long temp;
    temp = Double.doubleToLongBits(averageMark);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Student{");
    sb.append(super.toString()).append("averageMark=").append(averageMark);
    sb.append('}');
    return sb.toString();
  }
}
