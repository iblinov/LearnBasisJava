package com.string_enum;

import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    String str = "Firs1t";
    Optional<SimpleType> optional = SimpleType.defineSimpleType(str);
    System.out.println(optional.get());
  }
}
