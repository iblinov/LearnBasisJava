package by.bsu2.optional_base;

import java.util.Optional;

public class A {
}


class Item implements Cloneable{
    private int id;
    private String name;
    private double price;

    public Item() {
        // TODO Auto-generated constructor stub
    }

    public Item(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public Item clone() {
        Item copy = null;
        try {
            copy = (Item) super.clone();
        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }
        return copy;
    }

}
class Action {

    public Action() {

    }
    public Item correctPriceTraditional(Item item, double discount) {
        Item result;
        double newPrice = item.getPrice() - discount;
        if(newPrice > 0) {
            result = item.clone();
            result.setPrice(newPrice);
        } else {
            result = null;// or throw exception
        }
        return result;
    }
    public Optional<Item> correctPrice(Item item, double discount) {
        Item result;
        double newPrice = item.getPrice() - discount;
        if(newPrice > 0) {
            result = item.clone();
            result.setPrice(newPrice);
        } else {
            result = null;// or throw exception
        }
        return Optional.ofNullable(result);
    }
}
 class RunnerMain {

    public static void main(String[] args) {
        Item item = new Item(1, "Jeans", 25.0);
        Action action = new Action();
        Optional<Item> optionalWrong = action.correctPrice(item, 30);
        if (optionalWrong.isPresent()) {

            System.out.println("Item correct");
        } else {
            System.out.println("Item NOT correct");
        }
        Optional<Item> optionalItem = action.correctPrice(item,20);
        Item item2 = optionalItem.get();
        System.out.println("new price of Item " + item2.getPrice());
    }
}