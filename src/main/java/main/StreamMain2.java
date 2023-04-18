package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain2 {
  public static void main(String[] args) {
       String txt = """
               package main;
               package main;
               public class Stream Main2 {
               public class Stream Main2 {
                 public static void main String args {
                      String txt
               """;
       String arr[] = txt.split("\\s+");
       List<String> list = Arrays.asList(arr);

       Map<String, Integer> map = list.stream()
               .collect(Collectors.toMap(Function.identity(), s -> 1, (a, b) -> a + b));
    list.stream().flatMap(s -> Arrays.stream(s.split(""))).forEach(System.out::println);
    int x = 2;
    System.out.print(x++ * 5);
  }
}
