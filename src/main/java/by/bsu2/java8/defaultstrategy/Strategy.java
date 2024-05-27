package by.bsu2.java8.defaultstrategy;

@FunctionalInterface
public interface Strategy {
    default void anOperation() {
        System.out.println("Strategy anOperation");
    }
    static void action() {
        System.out.println("Strategy static action");
    }
    int define(int x, int y); // единственный абстрактный метод
}
