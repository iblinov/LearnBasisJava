package com.epam.array.service.learn.stream;



import java.util.List;

public class ReduseStringMain {
  public static void main(String[] args) {

    String[] text = "This is a func interface and can therefore".split("\\s");
    // int summa =
    List.of(text)
            .stream()
            .reduce((s, s2) -> s + s2).ifPresent(System.out::println);
    String str = " _ ";
    String res = List.of(text)
            .stream()
            .reduce("begin:   ", (s, s2) -> s + str + s2);
    System.out.println(res);
    int result = List.of(text)
            .stream()
            .reduce(0, (s, s2)-> s+s2.length(), (s, s2) -> 0);
    System.out.println(result);
  }
}
