package by.streamprj.finder;

import by.streamprj.entity.Order;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MAXIMYIIIKA on 05.05.2015.
 */
public class FindOrder {
    public List<Order> findBiggerAmountOrder(float bigAmount, List<Order> orders) {
        List<Order> bigPrices =
       orders.stream().filter(o -> o.getAmount() >= bigAmount).collect(Collectors.toList());
        return bigPrices;
    }
}
