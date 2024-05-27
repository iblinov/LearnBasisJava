package by.bsu2.java8.stream;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ihar_Blinou on 12/22/2016.
 */
public class RunFilter {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>(){
            {
                this.add(new Item(18, "T-Shirt", 400));
                this.add(new Item(12, "Dress", 300));
                this.add(new Item(17, "Gloves", 350));
                this.add(new Item(23, "Boots", 300));
                this.add(new Item(53, "Shoes", 400)); }
        };

        Stream<Item> stream = items.stream().filter(item->item.getPrice()>300);
        stream.forEach(System.out::println);

        Predicate<Item> predicate = item->item.getPrice()>300;
        Stream<Item> streamTwo = items.stream()
                .filter(predicate.and(item->item.getName().length()>5));
        //streamTwo.forEach(System.out::println);

        List<Item> list = items.stream().filter(item->item.getPrice()>300).collect(Collectors.toList());


    }
}
