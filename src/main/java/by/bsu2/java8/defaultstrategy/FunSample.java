package by.bsu2.java8.defaultstrategy;
@FunctionalInterface
public interface FunSample<T, V> {
	T action (V value);
}
