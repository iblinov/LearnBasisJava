package by.bsu2.java8.defaultstrategy;

public class WrongStrategyNew implements Strategy, StrategyTwo {
    public void anOperation(){
        Strategy.super.anOperation();
        System.out.println("Strategy^ anOperation");
    }// переопределение обязательно

    @Override
    public int define(int x1, int y1) {
        return 0;
    }
}
