package by.bsu2.java8.defaultstrategy;

public class FunSampleMain {

	public static void main(String[] args) {
		//1
		FunSample<Double, String> value = strValue -> Double.parseDouble(strValue);
		Double d = value.action("1.8");
		System.out.println(d);


		//2
		FunSample<Double, String> value2 = Double::parseDouble;
				
		Double d2 = value2.action("1.9");
		System.out.println(d2);

	}

}

