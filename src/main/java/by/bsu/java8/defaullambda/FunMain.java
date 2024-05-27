package by.bsu.java8.defaullambda;

public class FunMain {

	public static void main(String[] args) {
		//1
		FunSample<Double, String> value = strValue -> Double.parseDouble(strValue);
		Double d = value.sampleMethod("1.8");
		System.out.println(d);
		
		//2
		FunSample<Double, String> value2 = Double::parseDouble;
				
		Double d2 = value2.sampleMethod("1.9");
		System.out.println(d2);
	}

}
