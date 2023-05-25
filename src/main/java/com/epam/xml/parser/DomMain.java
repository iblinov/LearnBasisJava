package com.epam.xml.parser;

public class DomMain {
  public static void main(String[] args) {
//    StudentsDomBuilder domBuilder = new StudentsDomBuilder();
//    domBuilder.buildSetStudents("dataxml/students.xml");
//    System.out.println(domBuilder.getStudents());
    StudentsStaxBuilder staxBuilder = new StudentsStaxBuilder();
    staxBuilder.buildSetStudents("dataxml/students.xml");
    System.out.println(staxBuilder.getStudents());
  }
}
