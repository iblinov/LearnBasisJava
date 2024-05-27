package by.bsu.java8.defaullambda;

public interface Strategy {
	default void anOperation(){
		System.out.println("Strategy^ anOperation");
	}
}
