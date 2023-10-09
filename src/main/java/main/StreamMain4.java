package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain4 {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 7 , 12 , 15 , 21, 22, 31);
   // list.stream().map(i -> i%2 == 1 ? i+1: i).forEach(System.out::println);
//    List<Integer> integers = new ArrayList<>();
//    List<Integer> ints =  list.stream()
//          //  .mapToInt(i -> Integer.valueOf(i))
//            .reduce(new ArrayList<Integer>(),
//                    i -> i, (i1, i2) -> i1.add());
//    System.out.println(ints);
  }
}
