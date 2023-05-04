package com.epam.array.validator.impl;

import com.epam.array.validator.StringArrayValidator;

public class StringArrayValidatorImpl implements StringArrayValidator {
  private static final String INT_NUMBER_REGEX ="[-+]?\\d{1,3}";
  private static final String INT_ARRAY_REGEX = "(\\[0-9]{1,3}\\s+)+(\\d{1,3})";
  @Override
  public boolean stringNumberValidate(String stringNum) {
    boolean match = stringNum.matches(INT_NUMBER_REGEX);
    return match;
  }

  @Override
  public boolean stringArrayValidate(String stringArray) {
    return stringArray.matches(INT_ARRAY_REGEX);
  }
}
