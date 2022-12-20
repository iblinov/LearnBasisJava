package com.epam.learn.edu.service.impl;

import com.epam.learn.edu.entity.Student;
import com.epam.learn.edu.entity.StudentGroup;
import com.epam.learn.edu.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
  @Override
  public double sumAverageMark(StudentGroup group) {
    List<Student> list = group.getStudents();
    double sumResult = 0;
    for (int i = 0; i < list.size(); i++) {
       sumResult += list.get(i).getAverageMark();
    }
    return sumResult;
  }
}
