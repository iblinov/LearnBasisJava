package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EduMain {
  static Logger logger = LogManager.getLogger();

  public static void main(String[] args) {
    Student student = new Student("vasja", 4.9);
    Student student1 = new Student("vasja", 4.9);
    student1 = student;
    Student student2 = new Student("jack", 7.3);
    Student student3 = new Student("jane", 9.3);
    student.setName("uuu");
    System.out.println(student.equals(student1));
    System.out.println(student == student1);
    System.out.println(student.hashCode() == student1.hashCode());
    System.out.println(student.hashCode());
    System.out.println(student1.hashCode());
    Student s = null;
    if(s != null) {
      s.hashCode();
    }
    final int i = 6;
    long i1 = 10_000_000_000L;

    Integer i2 = 17;
    Integer i3 = 127;

    double d1 = 2.117;
    boolean a = true;
    boolean b = false;
    System.out.println(!a);

    int bonus = i2 > 7 ? 10 : 0;
    //  System.out.println(bonus);
    bonus = i2 < 7 ? 10 : 0;
    //   System.out.println(Integer.valueOf("101010", 2));
    Integer ob = Integer.parseInt("1");
    float res = 0.4f - 0.3f;
    System.out.println(res);
    BigDecimal big1 = new BigDecimal("0.4");
    BigDecimal big2 = new BigDecimal("0.3");
    BigDecimal bigRes = big1.subtract(big2, MathContext.DECIMAL32);
    System.out.println(bigRes);
    int [] arr = {1, 4, 5, 4, 6, 5};
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
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
