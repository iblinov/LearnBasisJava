package by.bsu2.consumer.entities;

import java.util.Random;
import java.util.function.Consumer;


public class OrderAction implements Consumer<Order> {
    private final int NUMBER_ITEMS_FOR_DISCOUNT = 3;
    @Override
    public void accept(Order order) {
        //??
        if (order.isDiscountOrder(NUMBER_ITEMS_FOR_DISCOUNT)){
            System.out.println("for Order " + order.getId() +   " set discount");
        } else {
            System.out.println("Order " + order.getId() +  " is standard");
        }
    }
}
