package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Base;

public class BaseMain {
  public static void main(String... args) {
    //Base.MAX_RANGE = 12;
//    System.out.println(Base.builder);
//    Base.builder.append("java");
//    System.out.println(Base.builder);
   // Base.builder = new StringBuilder(90);
    Base base = new Base();
    Base base1 = new Base();
    System.out.println(base.getBaseId());
    System.out.println(base1.getBaseId());
  }
}
