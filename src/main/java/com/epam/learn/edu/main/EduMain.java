package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class EduMain {
  static Logger logger = LogManager.getLogger();
  public static void main(String[] args) {
//    Student student = new Student("vasja", 4.9);
//    Student student1 = new Student("vasja", 4.9);
//    student1 = student;
//    Student student2 = new Student("jack", 7.3);
//    Student student3 = new Student("jane", 9.3);
//    System.out.println(student.equals(student1));
//    System.out.println(student == student1);
//    System.out.println(student.hashCode() == student1.hashCode());
//    System.out.println(student.hashCode());
//    System.out.println(student1.hashCode());
    int i = 1000;
    int i1 = 1000;
    System.out.println(i == i1);
    Integer i2 = 127;
    Integer i3 = 127;
    System.out.println(i2.equals(i3));
    System.out.println(i2 == i3);

  //  System.out.println(student.equals(student2));
//    List<Student> list = List.of(student1, student2, student3, student);
//    StudentGroup studentGroup = new StudentGroup(list);
//    StudentService service = new StudentServiceImpl();
//    double sum = service.sumAverageMark(studentGroup);
////    System.out.println(sum);
////    System.out.printf("result = %5.2f", sum);
//    logger.log(Level.DEBUG, "end program");
//
//    Ingredient s1 = Ingredient.TOMATO;
//    String s = "garlic";
//    Ingredient s2 = Ingredient.valueOf(s.toUpperCase());
//     List<Ingredient> ingredients = new ArrayList<>();
//     ingredients.add(s1);
//     ingredients.add(s2);
//    System.out.print(ingredients.get(1).getPrice());

  }
}
