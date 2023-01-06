package com.epam.array.main;

import com.epam.array.entity.CustomArray;
import com.epam.array.reader.impl.ArrayReaderImpl;
import com.epam.array.service.ArrayService;
import com.epam.array.service.impl.ArrayServiceImpl;
import com.epam.array.service.impl.ArrayStreamServiceImpl;

import java.util.Arrays;

public class DeclaringArrayMain {
  public static void main(String[] args) {
    ArrayReaderImpl reader = new ArrayReaderImpl();
    String filename = "data\\arrays.txt";
    int a[] = reader.readArray(filename);
    CustomArray customArray = new CustomArray(a);
    System.out.println(customArray);
    ArrayService service = new ArrayServiceImpl();
    int res = service.findMax(customArray);
    System.out.println(res);
    service = new ArrayStreamServiceImpl();
    res = service.findMax(customArray);
    System.out.println(res);
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
   
  }
}
