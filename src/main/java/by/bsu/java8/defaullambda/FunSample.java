package by.bsu.java8.defaullambda;
@FunctionalInterface
public interface FunSample<T, V> {
	T sampleMethod(V value);
	default void anOperation(){
		System.out.println("FunSample^ anOperation");
	}
    static void secondOperation(){
        System.out.println("FunSample^ secondOperation");
    }
}
