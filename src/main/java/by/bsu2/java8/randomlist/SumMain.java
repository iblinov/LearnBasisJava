package by.bsu2.java8.randomlist;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Ihar_Blinou on 2/5/2015.
 */
public class SumMain {
    public static void main(String[] args) {

        IntStream intStream = new Random().ints(10, -20, 20);
        //intStream.forEach(System.out::println);
//        OptionalDouble d= intStream.average();
//        System.out.println(d.getAsDouble());
        IntSummaryStatistics summary = intStream.summaryStatistics();
        System.out.println(summary.getSum());
        System.out.println(summary.getAverage());
        System.out.println(summary.getCount());
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());
        System.out.println(summary.toString());

        IntStream intStreamR = IntStream.range(-5, 5);
        intStreamR.forEach(System.out::println);
        IntStream intStreamG = IntStream.generate(()->new Random().nextInt());
        intStreamG.forEach(System.out::println);
//        Stream<Integer> stream;
//      //  stream = intStream.mapToObj();
//
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(7);
//        IntSummaryStatistics summary = list.stream().collect(Collectors.summarizingInt(Integer::intValue));
//        System.out.println(summary.getSum());
//        System.out.println(summary.getAverage());
//        System.out.println(summary.getCount());


    }
}
