package net.bsu.bifunction;

public class Runner {

	public static void main(String[] args) {
		MathCalculator mathCalculator = new MathCalculator();
		System.out.println(mathCalculator.calculate(BinaryOperation.PLUS, 1, 2));
	}

}
