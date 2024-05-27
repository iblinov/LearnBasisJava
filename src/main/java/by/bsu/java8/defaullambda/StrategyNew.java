package by.bsu.java8.defaullambda;

public interface StrategyNew {
	default void anOperation(){
		System.out.println("Strategy^ anOperation");
	}
	int define(int x1, int y1);
}
