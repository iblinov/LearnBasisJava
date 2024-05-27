package by.bsu2.function;

import java.math.BigDecimal;
import java.util.function.Supplier;
import java.util.stream.Stream;
class FibonacciSupplier implements Supplier<BigDecimal> {
    private BigDecimal prev = BigDecimal.ZERO;
    private BigDecimal next = BigDecimal.ONE;
    @Override public BigDecimal get() {
        BigDecimal current = next;
        next = prev.add(current);
        prev = current;
        return current;
    }
}

public class Main {

    public static void main(String[] args) {
        BigDecimal million = new BigDecimal(1_000);
        Stream.generate(new FibonacciSupplier())
                .filter((d) -> d.compareTo(million) >= 0)
                .limit(1)
                .forEach(System.out::println);

    }
}
