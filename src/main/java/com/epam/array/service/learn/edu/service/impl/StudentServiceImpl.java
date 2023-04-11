package com.epam.array.service.learn.edu.service.impl;

import com.epam.array.service.learn.edu.entity.Student;
import com.epam.array.service.learn.edu.entity.StudentGroup;
import com.epam.array.service.learn.edu.service.StudentService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class StudentServiceImpl implements StudentService {
  static Logger logger = LogManager.getLogger();
  @Override
  public double sumAverageMark(StudentGroup group) {
    List<Student> list = group.getStudents();
    double sumResult = 0;
    for (int i = 0; i < list.size(); i++) {
       sumResult += list.get(i).getAverageMark();
    }
    logger.log(Level.INFO, "Avg.= {} .", sumResult);
    return sumResult;
  }
}
