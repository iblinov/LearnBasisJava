package by.bsu2.repository;

import by.streamprj.entity.Order;

import java.util.function.Predicate;

@FunctionalInterface
public interface Specification extends Predicate<Order> {
 // boolean specify(Order order);
}
