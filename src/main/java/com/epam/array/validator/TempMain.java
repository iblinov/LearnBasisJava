package com.epam.array.validator;

import com.epam.array.validator.impl.StringArrayValidatorImpl;

import java.util.Arrays;
import java.util.stream.Stream;

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
//    String numStr0 = new String("7   5 45 394 2 9 0 54");
//  //  System.out.println(validator.stringArrayValidate(numStr));
    String numStr1 = "7   5 45 394" + " 2 9 0 54";
    numStr1 = numStr1.replaceAll("\\d", "abc");
    System.out.println(numStr1);
//    System.out.println(numStr1.hashCode() + " " + numStr0.hashCode());
//    System.out.println(numStr1 == numStr0);
//    numStr0 = numStr0.intern();
//    System.out.println(numStr1 == numStr0);
    String s =  "absentshjklhjhkjhjkh";
    String s0 = "Absent8789799879";
    System.out.println(s.compareToIgnoreCase(s0));
    System.out.println(s0.compareTo(s));
    String s2 = null;
  //  System.out.println(s2.isEmpty() + " " + s2.isBlank());
    Stream.of(0, 2, 4, 6, 8)
            .peek(System.out::print)
            .parallel()
            .map(i -> ++i)
            .forEach(System.out::print);

  }
}
