package by.bsu2.java8.lambda.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RunIterator {
    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.f));
                add(new Order(389, 2.9f));
                add(new Order(217, 1.7f));
                add(new Order(261, 16.f));
                add(new Order(781, 512.f));
            }
        };
        FindOrder fo = new FindOrder();
        int bigAmount = 10;
        // 1 classic
        List<Order> res = fo.findBiggerAmountOrder(bigAmount, orders);
        //2 short
        List<Order> res2 = orders.stream().filter(o -> o.getAmount() >= bigAmount).collect(Collectors.toList());
       //3
        Predicate<Order> predicate = order -> order.getAmount() >= bigAmount;
        List<Order> res3 = orders.stream().filter(predicate.negate()).collect(Collectors.toList());

        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }
}

