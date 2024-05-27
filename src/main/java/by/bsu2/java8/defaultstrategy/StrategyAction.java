package by.bsu2.java8.defaultstrategy;

public class StrategyAction {
    private int a;
    private int b;
    public StrategyAction(int a, int b ) {
        this.a = a;
        this.b = b;
    }
    public int action(Strategy strategy) {
        int res = strategy.define(a, b);
        return res;
    }
}
