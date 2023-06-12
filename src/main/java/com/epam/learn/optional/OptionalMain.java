package com.epam.learn.optional;

import java.util.*;

public class OptionalMain {
    public static void main(String[] args) {
       int [] ints = {1, 2, 3, 9};
       IntService service = new IntService();
//      System.out.println(service.average(ints));
     int[] ints2 = {};
//      System.out.println(service.average(ints2));
//      int[] ints3 = null;
//      System.out.println(service.average(ints3));
//       double avg = service.average(ints);
//       System.out.println(avg);
       Optional<Double> optionalDouble = service.averageOpt(ints2);
       double res = optionalDouble.get();
       if(optionalDouble.isPresent()) {
           System.out.println("get:" + optionalDouble.get());
       } else {
         System.out.println("orElse " + optionalDouble.orElse(0.0));
         System.out.println("or " + optionalDouble.or(()-> Optional.of(-1.0)));
         System.out.println("orElse " + optionalDouble.orElseGet(()-> -2.0));
         System.out.println("orElse " + optionalDouble.orElseThrow());
       }

      Optional<Double> optionalDouble2 = service.averageOpt(ints);
      System.out.println("orElse " + optionalDouble2.orElse(0.0));
      System.out.println("or " + optionalDouble2.or(()-> Optional.of(-1.0)));
      System.out.println("orElse " + optionalDouble2.orElseGet(()-> -2.0));
      System.out.println("orElse " + optionalDouble2.orElseThrow());

       if(optionalDouble.isEmpty()) {
           System.out.println("is empty");
       }

       optionalDouble.ifPresent(d -> System.out.println(++d));
//       Double res1 = optionalDouble.orElse(Double.NaN);
//       System.out.println("or:" + res1);
//     //  Double res2 = optionalDouble.orElseThrow();
//       optionalDouble.ifPresent(System.out::println);

    }
}
