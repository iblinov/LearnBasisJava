package main;

import java.util.*;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class StreamMain {
  public static void main(String[] args) {
    int q = 1;
    int a[] = {3, 7, 1, 9, 2, 2, 8};
    int res = Arrays.stream(a).reduce(1, (n1, n2) -> n1 * n2);
//    System.out.println(res);
//   Arrays.stream(a)
//           .filter(n -> n > 5).forEach(System.out::println);
    //.limit(5).filter(n -> n > 5).forEach(System.out::println);
    //.map(n -> n * 10).forEach(System.out::println);
    //.distinct().forEach(System.out::println);
    //.sorted().forEach(System.out::println);

//            .map(n -> n * 100)
//            .boxed()
//            .map(n -> Integer.toString(n))
//            .flatMap(s -> Arrays.stream(s.split("")))
//            .forEach(System.out::println);
    Predicate<Integer> predicate = new Predicate<Integer>() {
      @Override
      public boolean test(Integer n) {
        return n > 5;
      }
    };
    IntPredicate intPredicate = new IntPredicate() {
      @Override
      public boolean test(int n) {
        return n > 5;
      }
    };
//    Arrays.stream(a)
//            .filter(intPredicate).forEach(System.out::println);

    IntUnaryOperator operator = new IntUnaryOperator() {
      @Override
      public int applyAsInt(int operand) {
        return operand * 10;
      }
    };

    List<Integer> integerList = new ArrayList<>();
    IntConsumer consumer = new IntConsumer() {
      @Override
      public void accept(int value) {
        if (value > 50) {
          value++;
        }
        integerList.add(value);
        System.out.print(value + " ");
      }
    };
    Arrays.stream(a)
            .map(operator).forEach(consumer);
    System.out.println("\n" + integerList);


    Comparator<Integer> comparator = (o1, o2) -> o1 - o2;
Collections.sort(integerList, comparator);
Collections.sort(integerList, (o1, o2) -> o2 - o1);
    Comparator<String> comparator2 = new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    };
  }
}