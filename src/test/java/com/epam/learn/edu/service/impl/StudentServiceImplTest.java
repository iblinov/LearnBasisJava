package com.epam.learn.edu.service.impl;

import com.epam.array.service.learn.edu.entity.Student;
import com.epam.array.service.learn.edu.entity.StudentGroup;
import com.epam.array.service.learn.edu.service.StudentService;
import com.epam.array.service.learn.edu.service.impl.StudentServiceImpl;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//import static org.testng.Assert.*;
//
//public class StudentServiceImplTest {
//
//  @Test
//  public void testSumAverageMark() {
//    Student student = new Student("vasja", 4.9);
//    Student student1 = new Student("jhon", 4.3);
//    Student student2 = new Student("jack", 7.3);
//    Student student3 = new Student("petr", 9.3);
//    List<Student> list = List.of(student1, student2, student3, student);
//    StudentGroup studentGroup = new StudentGroup(list);
//    StudentService service = new StudentServiceImpl();
//    double actual = service.sumAverageMark(studentGroup);
//    double expected = 25.8;
//    assertEquals(actual, expected, .1);
//  }
//  @Test
//  public void testSumAverageMarkNegative() {
//    Student student = new Student("vasja", 4.9);
//    Student student1 = new Student("jhon", 4.3);
//    Student student2 = new Student("jack", 7.3);
//    Student student3 = new Student("petr", 9.3);
//    List<Student> list = List.of(student1, student2, student3, student);
//    StudentGroup studentGroup = new StudentGroup(list);
//    StudentService service = new StudentServiceImpl();
//    double actual = service.sumAverageMark(studentGroup);
//    double expected = 25.8;
//    assertEquals(actual, expected, .1);
//  }
//}