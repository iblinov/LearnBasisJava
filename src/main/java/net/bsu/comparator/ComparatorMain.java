package net.bsu.comparator;

import by.streamprj.entity.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

    public static void main(String[] args) {
        ArrayList<Order> list = new ArrayList<>();
        list.add(new Order(55,101));
        list.add(new Order(35,101));
        list.add(null);
        list.add(new Order(25,101));
        list.add(new Order(45,701));
        list.add(new Order(25,701));
        //Comparator.<Order, Float>comparing(o -> o.getAmount()).thenComparing(Order::getDescriptuion);
       // Comparator.comparing(Order::getAmount).thenComparing(Order::getOrderId);
     //   Comparator.comparing(Order::getAmount).thenComparing((o1, o2)-> o1.getOrderId() - o2.getOrderId());
        Comparator.nullsFirst((Order o1, Order o2)-> o1.getOrderId() - o2.getOrderId());

        System.out.println(list);
    //    list.sort((o1, o2) -> Float.compare(o1.getAmount(), o2.getAmount()));

    }
}
