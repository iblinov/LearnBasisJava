package by.bsu2.java8.randomlist;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomMain {
    public static void main(String[] args) {
        IntStream intStreamG = IntStream.generate(()->new Random().nextInt(21)-10);
        intStreamG.forEach(System.out::println);
    }
}
