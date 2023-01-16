package com.epam.array.validator;

import com.epam.array.validator.impl.StringArrayValidatorImpl;

import java.util.Arrays;

public class TempMain {
  public static void main(String[] args) {
//    String [] s1 = {"+56", "j78", "8888", "-65", "444"};
    StringArrayValidator validator = new StringArrayValidatorImpl();
//    for (String s : s1) {
//      System.out.println(validator.stringNumberValidate(s));
//    }
//    String s = "qwer;frg ;kjk,h{ j";
//    String s2[] = s.split("\\s*\\p{Punct}");
//    System.out.println(Arrays.toString(s2));
  String numStr = "7   5 45 394 2 9 0 54";
    System.out.println(validator.stringArrayValidate(numStr));

  }
}
