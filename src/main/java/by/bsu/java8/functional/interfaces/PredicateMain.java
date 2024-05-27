package by.bsu.java8.functional.interfaces;

import java.util.function.Predicate;

import by.bsu.java8.defaullambda.FunSample;

public class PredicateMain {

	public static void main(String[] args) {
		Predicate<String> pr = s -> s.length() < 3;
		
		boolean r1=pr.test("Java");
		System.out.println(r1);
		
		boolean r2=pr.negate().test("Java");
		System.out.println(r2);
		
		Predicate<String> pr2  = s -> s.length() > 4;
		System.out.println("OR");
		System.out.println(pr.or(pr2).test("1234"));
		System.out.println(pr.or(pr2).test("12345"));
		System.out.println(pr.or(pr2).test("12"));
		
		System.out.println("AND");
		System.out.println(pr.and(pr2).test("123"));
		System.out.println(pr.and(pr2).test("1234"));
		System.out.println(pr.and(pr2).test("12"));
		
		System.out.println("isEqual");
		Predicate<String> pr4 = Predicate.isEqual("123");
		
		System.out.println(pr4.test("123"));
		System.out.println(pr4.test("1234"));
		System.out.println(pr4.test(null));

		Predicate<String> pr3 = String::isEmpty;
		
	}
}
