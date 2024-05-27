package net.bsu.bifunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MathCalculator {

	private final Map<BinaryOperation, BiFunction<Double, Double, Double>> binaryOperation;

	public MathCalculator() {
		this.binaryOperation = new HashMap<>();
		init();
	}

	private void init() {
		binaryOperation.put(BinaryOperation.PLUS, (a, b) -> a + b);
		binaryOperation.put(BinaryOperation.MINUS, (a, b) -> a - b);
		binaryOperation.put(BinaryOperation.MULTIPLY, (a, b) -> a * b);
		binaryOperation.put(BinaryOperation.DIVIDE, (a, b) -> a / b);
	}

	public double calculate(BinaryOperation operation, double a, double b) {
		// get function
		BiFunction<Double, Double, Double> function = binaryOperation.get(operation);
		if (function == null) {
			throw new UnsupportedOperationException("unsupported operation: " + operation);
		}

		return function.apply(a, b);
	}

}
