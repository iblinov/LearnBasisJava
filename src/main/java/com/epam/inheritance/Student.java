package com.epam.inheritance;

public class Student {
  private int studentId;
  private String lastname;
  private double averageScore;
  private Address address;
 static class Address {
    private String city;
    private static String street;
    private int houseNumber;
    private String email;
    private String telegram;
    public static void m(){
      Student.m();
    }
  }
  public static void m(){

  }
}
