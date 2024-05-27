package by.bsu.java8.functional.interfaces;

import java.util.Optional;

public class OptionalMain {

	public static void main(String[] args) {
		Optional<Entity> optional = Optional.of(new Entity(1, "NoName"));

		System.out.println(optional.isPresent());           
		System.out.println(optional.get());                 
		System.out.println(optional.orElse(new Entity(2, "")));    

		optional.ifPresent(s -> System.out.println(s.getId())); 
		System.out.println(optional.ofNullable(new Entity(2, "n")));
		System.out.println(optional.ofNullable(null));
		System.out.println(optional.of(new Entity(2, "n")));
		System.out.println(optional.of(null));
	}

}
