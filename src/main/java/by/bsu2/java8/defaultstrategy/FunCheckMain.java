package by.bsu2.java8.defaultstrategy;

public class FunCheckMain {

	public static void main(String[] args) {
		FunChecking obj = new FunChecking();
        FunSample<Boolean, Integer> value0 = res -> obj.isPositive(res);
		FunSample<Boolean, Integer> value = obj::isPositive;
		value0.action(17);
        value.action(17);
	}

}
