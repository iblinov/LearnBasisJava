package com.epam.learn.entity;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class PersonMain {

  public static void main(String[] args) {

//    Person person = new StudentBuilder().setPersonId(777).setLastname("Jan").setAverageMark(9.41).createStudent();
    Teacher teacher = new Teacher(23, "Jhon", "prof.");
//    System.out.println(person);
    System.out.println(teacher);

    Student student = new Student.StudentBuilder()
            .setPersonId(88)
            .setAverageMark(9)
            .setLastname("")
            .createStudent();
    }
  }


