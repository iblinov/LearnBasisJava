package by.bsu2.java8.functional.interfaces;
@FunctionalInterface
public interface FunctionThrow<T, R, E extends Exception> {
    T apply(R r) throws E;
}
