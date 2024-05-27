package by.bsu2.repository;

import by.streamprj.entity.Order;

public class IdSpecification implements Specification {
  private int id;

  public IdSpecification(int id) {
    this.id = id;
  }

  @Override
  public boolean test(Order order) {
    return id == order.getOrderId();
  }
}
