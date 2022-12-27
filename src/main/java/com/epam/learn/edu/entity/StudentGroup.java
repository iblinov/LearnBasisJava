package com.epam.learn.edu.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StudentGroup {
  private List<Student> students = new ArrayList<>();

  public StudentGroup(List<Student> students) {
    this.students = students;
  }

  public List<Student> getStudents() {
    return students;
  }
  public void addStudent(Student student) {
    students.add(student);
  }

  public boolean remove(Student o) {
    return students.remove(o);
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", StudentGroup.class.getSimpleName() + "[", "]")
            .add("students=" + students)
            .toString();
  }
}
