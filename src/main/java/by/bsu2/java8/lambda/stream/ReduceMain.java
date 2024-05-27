package by.bsu2.java8.lambda.stream;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Ihar_Blinou on 6/24/2015.
 */
public class ReduceMain {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<Item>() {
            {
                this.add(new Item(18, "T-Shirt", 200));
                this.add(new Item(12, "Dress", 300));
                this.add(new Item(17, "Gloves", 350));
                this.add(new Item(23, "Boots", 300));
                this.add(new Item(53, "Shoes", 400));
            }
        };
//        Stream<Item> stream = list.stream();
//        stream.count();
//        stream.toArray();

        double sum = list.stream()
                .map(Item::getPrice)
                .dropWhile(v -> v<350)
                .reduce(0.0, Double::sum);
        System.out.println(sum);

        double sum1 = list.stream()
                .map(Item::getPrice)
                .filter(v -> v<350)
                .reduce(0.0, (v1, v2)-> v1 + v2);
        System.out.println(sum1);


    }
}

