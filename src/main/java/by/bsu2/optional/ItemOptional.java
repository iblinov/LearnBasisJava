package by.bsu2.optional;

import java.util.Optional;

public class ItemOptional {
    private Long itemId;
    private String name;
    private Optional<Double> price;
    public ItemOptional() {	}
    public ItemOptional(Long itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = Optional.ofNullable(price);
    }

    public Long getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public Optional<Double> getPrice() {
        return price;
    }
}
