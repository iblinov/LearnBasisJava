package by.bsu2.java8.functional.interfaces;

import java.util.function.Supplier;


public class SupplierMain {

	public static void main(String[] args) {
		Supplier<Entity> supplier = Entity::new;
		Entity entity = supplier.get();
	}
}
