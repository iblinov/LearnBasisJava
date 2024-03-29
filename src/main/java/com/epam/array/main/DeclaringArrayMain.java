package com.epam.array.main;

import com.epam.array.entity.CustomArray;
import com.epam.array.reader.impl.ArrayReaderImpl;
import com.epam.array.service.ArrayService;
import com.epam.array.service.impl.ArrayServiceImpl;
import com.epam.array.service.impl.ArrayStreamServiceImpl;

import java.util.*;

enum Shape {
  RECTANGLE, TRIANGLE, CIRCLE;

  public double defineSquare(double... x) {
// here may be checking the parameters for correctness
    return switch (this) {
      case RECTANGLE -> x[0] * x[1];
      case TRIANGLE -> x[0] * x[1] / 2;
      case CIRCLE -> Math.pow(x[0], 2) * Math.PI;
      default -> throw new EnumConstantNotPresentException(getDeclaringClass(), name());
    };
  }
}

record Type(int id, StringBuilder filename) {
  @Override
  public StringBuilder filename() {
    return new StringBuilder(filename.toString());
  }
}

public class DeclaringArrayMain {



  public static void main(String[] args) {
    ArrayService service = new ArrayServiceImpl();
    CustomArray array = new CustomArray(new int[]{7, 2, 9, 5, 10, 0});
   int max =  service.findMax(array);
    System.out.println(max);
//    HashMap<String, String> map = new HashMap<>();
//    map.put(null, null);
//    Hashtable<String, String> table = new Hashtable<>();
//    table.put(null, null);
    Properties props = new Properties();
    props.put(null, "value");
    System.out.println(props.size());
//    int t = 1;
//    t = 9;
//    Type obj = new Type(77, new StringBuilder("abc.txt"));
//    StringBuilder s = obj.filename().append("uyt");
//    System.out.println(obj.filename());
//    System.out.println(obj.id());
//    System.out.println(obj.toString());
//    System.out.println(obj.hashCode());
//    String roleStr = "client11";
//    roleStr = roleStr.toUpperCase();
//    System.out.println(roleStr);
//    roleStr ="t";
//    int b = 1;
//
//    ArrayReaderImpl reader = new ArrayReaderImpl();
//    String filename = "data\\arrays.txt";
//    int a[] = reader.readArray(filename);
//    CustomArray customArray = new CustomArray(a);
//    System.out.println(customArray);
//    ArrayService service = new ArrayServiceImpl();
//    int res = service.findMax(customArray);
//    System.out.println(res);
//    service = new ArrayStreamServiceImpl();
//    res = service.findMax(customArray);
//    System.out.println(res);
    //   System.out.println(Arrays.toString(a));
//    int [] array = {1, 2, 3, 4, 5};
//    int a[] = new int[10];
//    String strings[] = new String[10];
//    var b = new int[]{1, 2, 3, 4, 5};
//
//    var q = "dfd";
//    var n = Integer.parseInt("6667");
//    var m = Arrays.stream(a).asLongStream().average();
//    var list = new ArrayList<String>();
//      Shape shape = Shape.valueOf("TRIANGLE");
//      Shape shape1 = Shape.valueOf("tRIANGLE");

  }
}
