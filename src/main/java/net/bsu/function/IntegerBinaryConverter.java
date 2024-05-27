package net.bsu.function;

import java.util.function.Function;

public class IntegerBinaryConverter implements Function<Integer, String> {

	@Override
	public String apply(Integer number) {
		StringBuilder sb = new StringBuilder();
		while (number != 0) {
			int r = number % 2;
			number /= 2;
			sb.append(r);
		}
		return sb.reverse().toString();
	}

}
