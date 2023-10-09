package main;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class StreamMain3 {
  public static void main(String[] args) {
    String[] arrayStr = {"as", "a", "the", " ", "d", "on", "and", ""};
    System.out.println(Arrays.stream(arrayStr)
            .filter(s -> s.length() > 2)
            .toList());
    int[] arrayInt = {1, 3, 5, 9, 17, 33, 65};
    System.out.println(Arrays.stream(arrayInt)
            .filter(((IntPredicate) i -> i > 32).or(i -> i < 4))
            .boxed()
            .toList());

  }
}
