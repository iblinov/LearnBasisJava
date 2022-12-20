package com.epam.learn.optional;

import java.util.*;

public class OptionalMain {
    public static void main(String[] args) {
       int [] ints = {1, 2, 3};
       IntService service = new IntService();
//       double avg = service.average(ints);
//       System.out.println(avg);
       Optional<Double> optionalDouble = service.averageOpt(ints);
       if(optionalDouble.isPresent()) {
           System.out.println("get:" + optionalDouble.get());
       }
       if(optionalDouble.isEmpty()) {
           System.out.println("is empty");
       }
       Double res1 = optionalDouble.orElse(Double.NaN);
       System.out.println("or:" + res1);
     //  Double res2 = optionalDouble.orElseThrow();
       optionalDouble.ifPresent(System.out::println);

    }
}
