package by.bsu.java8.functional.interfaces;

import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Consumer<Entity> consumer = p -> System.out.println( p.getId() + " " + p.getName() );
		consumer.accept(new Entity(1, "Bender"));
		System.out.println("-------------------------");
		Consumer<Entity> consumer0 = p -> System.out.println( p );	
		Consumer<Entity> consumer1 = consumer.andThen(consumer0);
		consumer1.accept(new Entity(1, "Bender"));
	}
}
