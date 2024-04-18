package course3;

import java.util.Arrays;
import java.util.function.Predicate;

public class Stream0 {
  public static void main(String[] args) {
    String[] arrayStr = {"as", "a", "the", " ", "d", "on", "and", "on"};
    System.out.println(Arrays.stream(arrayStr)
            .filter(Predicate.isEqual("on"))
            .toList());

  }
}
