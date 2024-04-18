package com.epam.learn.edu.main;

import com.epam.learn.edu.entity.Student;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class XmlMain {
  public static void main(String[] args) throws FileNotFoundException {
    Student student = new Student("fas", 7.2);
    Student student1 = new Student("fasfr", 5.2);
    List<Student> list = new ArrayList<>();
    list.add(student1);
    list.add(student);
    XMLEncoder encoder = new XMLEncoder(new PrintStream("data\\stud.xml"));
    encoder.writeObject(list);
    encoder.flush();
    //XMLDecoder xmlDecoder = new
  }
}
