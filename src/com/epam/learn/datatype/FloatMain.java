package com.epam.learn.datatype;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FloatMain {
  public static void main(String[] args) {
    double d = 1.23;
    float f = 2.34F;
    double ds = 1.11e3;
 //   System.out.println(ds);
//    Integer a = new Integer(1);
//    Integer b = new Integer(1);
//    System.out.println(a==b);
    List<int[]> list1 = List.of(new int[]{1, 4}, new int[]{10, 41});
    List<int[]> list2 = List.of(new int[]{1, 4}, new int[]{10, 41});
    System.out.println(list1.equals(list2));
    System.out.println(Objects.deepEquals(list1.toArray(), list2.toArray()));
    System.out.println(Arrays.deepEquals(list1.toArray(), list2.toArray()));
  }
}
