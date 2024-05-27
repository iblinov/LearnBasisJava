package by.bsu2.java8.lambda.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Stream;

public class ListMain {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>() {
			{
				this.add(1);
				this.add(2);
				this.add(3);
				this.add(4);
				this.add(5);
				this.add(6);
			}
		};
		//(ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);


		numbers.forEach(value -> m(value));

		numbers.forEach(Integer::floatValue);

	///	numbers.forEach(value -> System.out.print(value));
	//	numbers.forEach(System.out::print);
		numbers.removeIf(value -> value > 5);
	//	numbers.forEach(System.out::print);
		ArrayList<Integer> res = new ArrayList<>();
		//Stream<Integer> streamValue = numbers.stream();
		//streamValue.count();
		Stream<Integer> streamValue = numbers.stream().filter(value -> value < 4).map(o-> o + 10);
		long c = streamValue.count();
		System.out.println(res);
		System.out.println(numbers);
		System.out.println(c);
	}

	static void m(int a) {
		++a;
	}
}