package by.bsu2.java8.defaultstrategy;

@FunctionalInterface
public interface StrategyTwo {
    default void anOperation() {
        System.out.println("StrategyTwo anOperation");
    }
    static void action() {
        System.out.println("StrategyTwo static action");
    }
    int define(int x1, int y1);
    //boolean isExist(Object obj);
}
