package by.bsu.java8.functional.interfaces;

import java.text.NumberFormat;
import java.util.function.Function;
import java.util.Locale;

public class FunctionMain {

	public static void main(String[] args) {
		Function<String, Double> fun = Double::parseDouble;
		Function<Locale, NumberFormat> fun1 = NumberFormat::getInstance;
		Function<String, String> fun2 = fun.andThen(s ->  fun1.apply(Locale.US).format(s));
		System.out.println(fun2.apply("70000000"));
		
		Function<String, Double> fun3 = fun.compose(fun2);
		System.out.println(fun3.apply("700"));

        Function<Integer, Integer> f1 = x -> x + 1;
        Function<Integer, Integer> f2 = x -> x * 10;
		Function<Integer, Integer> f3 = f1.compose(f2);
		Function<Integer, Integer> f4 = f2.compose(f1);
		System.out.println(f3.apply(2));
		System.out.println(f4.apply(2));
	}
}
