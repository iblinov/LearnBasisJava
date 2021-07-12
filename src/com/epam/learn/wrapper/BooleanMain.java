package com.epam.learn.wrapper;

public class BooleanMain {
  public static void main(String[] args) {
    Boolean bool1 = Boolean.TRUE;
    Boolean bool2 = true;
    Boolean bool3 = Boolean.valueOf("tRuE");
  //  System.out.println(bool3);
    boolean bool4 = Boolean.parseBoolean("ABc");
   // System.out.println(bool4);
    System.out.println(bool1 && bool4);
    System.out.println(Boolean.logicalAnd(bool1, bool4));
  }
}
