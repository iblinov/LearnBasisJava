package by.bsu.java8.defaullambda;

public class FunCheckMain {

	public static void main(String[] args) {
		FunChecking obj = new FunChecking();
		FunSample<Boolean, Integer> value = obj::isPositive;
		value.sampleMethod(17);
	}

}
