package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Ingredient;
import com.epam.learn.edu.entity.Student;
import com.epam.learn.edu.entity.StudentGroup;
import com.epam.learn.edu.service.StudentService;
import com.epam.learn.edu.service.impl.StudentServiceImpl;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class EduMain {
  static Logger logger = LogManager.getLogger();
  public static void main(String[] args) {
    Student student = new Student("vasja", 4.9, Ingredient.TOMATO);
    Student student1 = new Student("jon", 4.3, Ingredient.TOMATO);
    Student student2 = new Student("jack", 7.3, Ingredient.TOMATO);
    Student student3 = new Student("jane", 9.3, Ingredient.TOMATO);
    List<Student> list = List.of(student1, student2, student3, student);
    StudentGroup studentGroup = new StudentGroup(list);
    StudentService service = new StudentServiceImpl();
    double sum = service.sumAverageMark(studentGroup);
//    System.out.println(sum);
//    System.out.printf("result = %5.2f", sum);
    logger.log(Level.DEBUG, "end program");

    Ingredient s1 = Ingredient.TOMATO;
    String s = "garlic";
    Ingredient s2 = Ingredient.valueOf(s.toUpperCase());
     List<Ingredient> ingredients = new ArrayList<>();
     ingredients.add(s1);
     ingredients.add(s2);
    System.out.print(ingredients.get(1).getPrice());
  }
}
