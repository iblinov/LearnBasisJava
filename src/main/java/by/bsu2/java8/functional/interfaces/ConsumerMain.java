package by.bsu2.java8.functional.interfaces;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerMain {

	public static void main(String[] args) {

        ArrayList<Item> list = new ArrayList<Item>(){
            {
                this.add(new Item(18, "T-Shirt", 400));
                this.add(new Item(12, "Dress", 300));
                this.add(new Item(17, "Gloves", 350));
                this.add(new Item(23, "Boots", 300));
                this.add(new Item(53, "Shoes", 400));
            }
        };
        Consumer<Item> cons = p -> p.setPrice(p.getPrice() * 0.9);
        list.stream().forEach(cons);
        System.out.println(list);
        Consumer<Entity> consumer = p -> System.out.println( p.getId() + " " + p.getName() );
		consumer.accept(new Entity(1, "Bender"));
		System.out.println("-------------------------");
		Consumer<Entity> consumer0 = p -> System.out.println( p );	
		Consumer<Entity> consumer1 = consumer.andThen(consumer0);
		consumer1.accept(new Entity(1, "Bender"));
	}
}
