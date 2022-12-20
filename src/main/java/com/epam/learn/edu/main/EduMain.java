package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Student;
import com.epam.learn.edu.entity.StudentGroup;
import com.epam.learn.edu.service.StudentService;
import com.epam.learn.edu.service.impl.StudentServiceImpl;

import java.util.List;

public class EduMain {
  public static void main(String[] args) {
    Student student = new Student("vasja", 4.9);
    Student student1 = new Student("jhon", 4.3);
    Student student2 = new Student("jack", 7.3);
    Student student3 = new Student("petr", 9.3);
    List<Student> list = List.of(student1, student2, student3, student);
    StudentGroup studentGroup = new StudentGroup(list);
    StudentService service = new StudentServiceImpl();
    double sum = service.sumAverageMark(studentGroup);
    System.out.println(sum);
    System.out.printf("result = %5.2f", sum);
  }
}
