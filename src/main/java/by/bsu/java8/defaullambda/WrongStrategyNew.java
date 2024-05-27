package by.bsu.java8.defaullambda;

public interface WrongStrategyNew extends Strategy , StrategyNew
{
    default void anOperation(){
        System.out.println("Strategy^ anOperation");
    }// переопределение обязательно
}
