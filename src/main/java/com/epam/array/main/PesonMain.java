package com.epam.array.main;

import com.epam.array.entity.Person;
import com.epam.array.entity.Size;
import com.epam.array.entity.Student;

public class PesonMain {
  public static void main(String[] args) {
    Person person = new Person();
    Object o = new Person();
    Object arr = new int[6];
    Student s1 = new Student(11, "ab");
    Student s2 = new Student(11, "ab");
    Size size = Size.MEDIUM;
  }
}
