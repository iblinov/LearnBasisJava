package by.bsu2.optional;

import java.util.Optional;

public class Item {
    private Long itemId;
    private String name;
    private double price;
    private Optional<String> description = Optional.empty();
    public Item() {	}
    public Item(Long itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description.isBlank();
        Optional.ofNullable(description);
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}