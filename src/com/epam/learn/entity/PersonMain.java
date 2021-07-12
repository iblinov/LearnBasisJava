package com.epam.learn.entity;

public class PersonMain {
  public static void main(String[] args) {
    Person person = new Student(777, "Jan", 9.41);
    Teacher teacher = new Teacher(23, "Jhon", "prof.");
    System.out.println(person);
    System.out.println(teacher);
    }
  }

