package by.bsu2.repository;

import by.streamprj.entity.Order;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderRepository {
  private List<Order> orders = new ArrayList<>();

  public boolean add(Order order) {
    return orders.add(order);
  }

  public boolean remove(Object o) {
    return orders.remove(o);
  }

  public void sort(Comparator<? super Order> c) {
    orders.sort(c);
  }

  public List<Order> query(Specification specification) {
      List<Order> list = orders.stream().filter(specification).collect(Collectors.toList());
 //     list.stream().filter(s -> specification.specify(s));
//      for (Order current : orders) {
//       if(specification.specify(current)){
//         list.add(current);
//       }
//      }
      return list;
  }

}
