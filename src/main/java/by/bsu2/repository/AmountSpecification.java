package by.bsu2.repository;

import by.streamprj.entity.Order;

public class AmountSpecification implements Specification {
  private float minAmount;
  private float maxAmount;

  public AmountSpecification(float minAmount, float maxAmount) {
    this.minAmount = minAmount;
    this.maxAmount = maxAmount;
  }

  @Override
  public boolean test(Order order) {
    float currentAmount = order.getAmount();
    return minAmount <= currentAmount && currentAmount <= maxAmount;
  }
}
