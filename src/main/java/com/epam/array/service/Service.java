package com.epam.array.service;

import com.epam.array.entity.Student;

import java.util.Optional;
import java.util.OptionalInt;

public class Service {

  public OptionalInt area(int length){
    OptionalInt result = OptionalInt.empty();
    if (length > 0) {
      result = OptionalInt.of(length * length);
    }
    return result;
  }
  public Optional<Student> findById(int id) {
    Student student = new Student(22, "ab");
    Optional<Student> optionalStudent = Optional.of(student);
    return optionalStudent;
  }
}
