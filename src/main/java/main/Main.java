package main;

import bill.Bill;
import dish.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 =
                new Pizza(true, false, true, true, false, true, false, true, true);
        Pizza pizza2 = new Pizza(true, false, true, true, false, true, false, true, false);
        System.out.println(pizza1);
        System.out.println(pizza2);
        Bill bill = new Bill();
       String res1 = bill.createBill(pizza1);
        String res2 = bill.createBill(pizza2);
        System.out.println(res1);
        System.out.println(res2);

    }
}