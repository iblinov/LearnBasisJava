package net.bsu.function;

import java.util.function.Function;
import java.util.logging.Logger;

public class Runner {

	private static final Logger LOGGER = Logger.getLogger(Runner.class.getSimpleName());

	public static void main(String[] args) {
		Function<Integer, String> converter = new IntegerBinaryConverter();
		LOGGER.info(converter.apply(123));
	}

}
