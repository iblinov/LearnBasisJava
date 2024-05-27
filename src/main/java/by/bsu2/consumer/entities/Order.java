package by.bsu2.consumer.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;



public class Order  {
    private int id;
    private Map<String, Integer> items;
    private Optional<String> description = Optional.empty();

    public Order(int id, Map<String, Integer> items) {
       this.id = id;
        this.items = items;

    }

    public int size() {

        return items.size() + 5;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = Optional.ofNullable(description);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, Integer> getItems() {

        return items;
    }

    public void addItem(String orderId, Integer numberItems) {
        items.put(orderId, numberItems);
    }


    public boolean isDiscountOrder(int maxNumberItems) {
        int counter = 0;
        Collection<Integer> values = items.values();
        for (Integer subject : items.values()) {
            counter += subject;
        }
        return (counter >= maxNumberItems);
    }


    @Override
    public String toString() {
        String res = String.join(": ", "Order", "id=", String.valueOf(id), "items=", items.toString());
        return res;
    }


}
