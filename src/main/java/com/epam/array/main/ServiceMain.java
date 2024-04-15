package com.epam.array.main;


import com.epam.array.entity.Student;
import com.epam.array.service.Service;

import java.util.Optional;
import java.util.OptionalInt;

public class ServiceMain {
  public static void main(String[] args) {
    int len = -3;
    Service service = new Service();

//    OptionalInt r = service.area(len);
//    if (r.isPresent() ) {
//      int res = r.getAsInt();
//      System.out.println(res);
//    }
//    r.ifPresent(System.out::println);
//   int res2 = r.orElse(-1);
//    System.out.println(res2);
//
    Optional<Student> optional = service.findById(1);

  }
}
