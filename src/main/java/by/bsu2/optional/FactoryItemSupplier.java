package by.bsu2.optional;

import java.util.function.Supplier;

public class FactoryItemSupplier implements Supplier<String> {
    @Override
    public String get() {
        return "C++";
    }
}
