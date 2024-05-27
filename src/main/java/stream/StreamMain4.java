package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain4 {
  public static void main(String[] args) {
//    Stream<String> stream = Stream.of("kotlin", "ruby", "java", "scala", "sun");
//    stream.flatMap(s -> Arrays.stream(s.split("")).sequential())
//            .forEach(System.out::println);

//    int sumLength = Stream.of("kotlin", "ruby", "java", "scala", "sun")
//            .map(s -> s.length())
//            .reduce(0, (identity, n) -> identity + n);
//    System.out.println(sumLength);

    Map<Integer, List<String>> byLength = Stream.of("kotlin", "ruby", "java", "scala", "sun")
            .collect(Collectors.groupingBy(String::length));
    System.out.println(byLength);

    Map<Integer, Integer> sumChars =  Stream.of("kotlin", "ruby", "java", "scala", "sun")
            .collect(Collectors.groupingBy(String::length, Collectors.summingInt(String::length)));
    System.out.println(sumChars);

    String sentence = """  
        Returns a stream consisting of the 
        results of replacing each element of
         this stream with the contents of a 
         mapped stream produced by applying 
         the provided mapping function to each element""";

    Map<String, Long> map = Arrays.stream(sentence.split("\\s+"))
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    System.out.println(map);

    Map<String, Long> map2 = Arrays.stream(sentence.split(""))
            .filter(s -> !s.isBlank())
            .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    System.out.println(map2);
  }
}
