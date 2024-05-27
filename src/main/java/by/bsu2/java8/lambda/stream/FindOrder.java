package by.bsu2.java8.lambda.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindOrder {
    public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
        ArrayList<Order> bigPrices = new ArrayList();
        Iterator<Order> it = orders.iterator();
        while (it.hasNext()) {
            Order current = it.next();
            if (current.getAmount() >= bigAmount) {
                bigPrices.add(current);
            }
        }
        return bigPrices;
    }
}
