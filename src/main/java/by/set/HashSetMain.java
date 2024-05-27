package by.set;

import java.util.HashSet;

public class HashSetMain {
  public static void main(String[] args) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.add("8Y");
    hashSet.add("Y2");
    hashSet.add("Y2");
    hashSet.add("8Y");
    hashSet.add("Y");
    hashSet.add("5Y");
    hashSet.add("Y-");
    hashSet.stream()
            .peek(System.out::print)
            .map(String::toLowerCase)
            .peek(System.out::print)
            .forEach(s -> System.out.println(" " + s.hashCode()));
  }
}
