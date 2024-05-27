package by.streamprj.runner;

/**
 * Created by Ihar_Blinou on 12/9/2015.
 */
import by.streamprj.entity.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class SortOrderRunner {
    public static void main(String[] args) {
        ArrayList<Order> p = new ArrayList<Order>() {
            {
                add(new Order(52201, 9.75f));
                add(new Order(52127, 13.99f));
                add(new Order(47063, 45.95f));
                add(new Order(90428, 60.9f));
                add(new Order(53295, 31f));
                add(new Order(63220, 14.9f));
            }
        };

        // сортировка списка объектов
        Collections.sort(p, ((o1, o2) -> o1.getOrderId()-o2.getOrderId()));
        System.out.println(p);
        p.sort(Comparator.comparing(Order::getAmount));
        String s ="\\s";
        System.out.println(p);
    }
}
