package by.bsu2.java8.functional.interfaces;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.Locale;

public class FunctionMain {

	public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>() {
            {
                this.add(7);
                this.add(3);
                this.add(5);
            }
        };
        list.stream().map(v -> v * 3).forEach(System.out::println);
        list.stream().map(Math::cos).forEach(System.out::println);

		Function<String, Double> fun = Double::parseDouble;
		Function<Double, BigDecimal> fun0 = d -> new BigDecimal(d + 1);
		Function<String, BigDecimal> funComp = fun.andThen(fun0);
		System.out.println("------->    " + fun0.apply(2.000000001));
		ArrayList<String> listStr = new ArrayList<String>() {
			{
				this.add("71");
				this.add("35");
				this.add("51");
			}
		};
		listStr.stream().map(fun.andThen(fun0)).forEach(System.out::println);// or funComp
		Function<Locale, NumberFormat> fun1 = NumberFormat::getInstance;

		Function<String, String> fun2 = fun.andThen(s ->  fun1.apply(Locale.US).format(s));//?
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
