package com.string_enum;

import java.util.Arrays;
import java.util.Optional;

public enum SimpleType {
  FIRST("First"), SECOND("Second");
  private final String value;

  SimpleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public static Optional<SimpleType> defineSimpleType(String val) {
   return Arrays.stream(SimpleType.values())
            .filter(e -> val.equals(e.getValue()))
            .findFirst();
  }
}
