package by.bsu.java8.lambda.stream;

import java.util.Arrays;

import java.util.List;

public class ListMain {

	 public static void main(String[] args) {
	        List<Integer> numbers =  Arrays.asList(1, 2, 3, 4, 5, 6);

	        for (int number : numbers) {
             System.out.println(number);
         }
	        numbers.forEach((Integer value) -> System.out.println(value));
	        numbers.forEach( value -> System.out.println(value));
	        numbers.forEach(System.out::println);
	    }
}
