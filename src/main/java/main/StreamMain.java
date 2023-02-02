package main;

import java.util.Arrays;

public class StreamMain {
  public static void main(String[] args) {
    int q = 1;
    int a[] = {3, 7, 1, 9, 2, 2, 8};
//    int res = Arrays.stream(a).reduce(1, (n1, n2) -> {
//
//      return n1 * n2;});
//    System.out.println(res);
    Arrays.stream(a)
            .filter(n -> n > 5).forEach(System.out::println);
            //.limit(5).filter(n -> n > 5).forEach(System.out::println);
            //.map(n -> n * 10).forEach(System.out::println);
            //.distinct().forEach(System.out::println);
            //.sorted().forEach(System.out::println);

//            .map(n -> n * 100)
//            .boxed()
//            .map(n -> Integer.toString(n))
//            .flatMap(s -> Arrays.stream(s.split("")))
//            .forEach(System.out::println);

  }
}
