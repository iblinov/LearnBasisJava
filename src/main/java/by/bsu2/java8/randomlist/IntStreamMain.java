package by.bsu2.java8.randomlist;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ihar_Blinou on 6/23/2015.
 */
public class IntStreamMain {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(10, -20, 20)
                                         .boxed().collect(Collectors.toList());
        System.out.println(list);
        Stream<Integer> st1 = list.stream();
        st1.filter(v -> v > 0).forEach(new PrintIntConsumer());

        System.out.println();
        Stream<Integer> st2 = list.stream();
        st2.map(v -> v*v).forEach(new PrintIntConsumer());

        System.out.println();
        Stream<Integer> st3 = list.stream();
        st3.sorted().forEach(new PrintIntConsumer());


    }
}
