package by.bsu2.java8.defaultstrategy;

public class FunMain {

	public static void main(String[] args) {
		//1
		FunSample<Double, String> value = strValue -> Double.parseDouble(strValue);
		Double d = value.action("1.8");
		System.out.println(d);
		
		//2
		FunSample<Double, String> value2 = Double::parseDouble;
				
		Double d2 = value2.action("1.9");
		System.out.println(d2);
        Integer i = 0;
        FunSample<Integer, Integer> value3 = new Integer(i)::compareTo;
        value3 = i::compareTo;
	}
}
