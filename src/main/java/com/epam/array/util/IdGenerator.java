package com.epam.array.util;

public class IdGenerator {
  private static int currentId;
  public static int generateId(){
    return ++currentId;
  }
}
