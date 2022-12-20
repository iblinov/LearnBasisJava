package com.epam.learn.inheritance;

public class BuilderMain {
  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder(32);
    s1.append("java");
    StringBuilder s2 = new StringBuilder("java");
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode() == s2.hashCode());
    System.out.println(s1.substring(0).contentEquals(s2));

  }
}
