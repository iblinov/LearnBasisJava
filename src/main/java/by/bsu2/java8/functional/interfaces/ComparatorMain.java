package by.bsu2.java8.functional.interfaces;
import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class ComparatorMain {

	public static void main(String[] args) {


        ArrayList<Item> list = new ArrayList<Item>(){
            {
                this.add(new Item(18, "T-Shirt", 400));
                this.add(new Item(92, "Dress", 300));
                this.add(new Item(17, "Dress", 300));
                this.add(new Item(23, "Boots", 300));
                this.add(new Item(53, "Shoes", 400));
            }
        };
        list.forEach(System.out::println);
        Comparator<Item> comparator = new Comparator<>() {
            @Override
            public int compare(Item o1, Item o2) {
              return o1.getId() - o2.getId();
            }
        };

		Comparator<Item> comp = (e1, e2) -> e1.getId() - e2.getId();

        list.sort((e1, e2) -> e1.getId() - e2.getId());
        list.sort(new ItemIdComparator());

        Comparator<Item> comp1 = Comparator.comparing(Item::getId);
        Item e1 = new Item(23, "Boots", 300);
        Item e2 = new Item(53, "Shoes", 400);
		System.out.println(comp.compare(e1, e2));
		System.out.println(comp.reversed().compare(e1, e2));
        System.out.println("--------------------");
        list.sort(Comparator.comparing(Item::getPrice)
                            .thenComparing((t1, t2) -> t1.getId() - t2.getId()).reversed().thenComparing(Item::getId));
        list.forEach(System.out::println);

        Function<Item, Integer> function = Item::getId;
        function.apply(e1);
	}

}
