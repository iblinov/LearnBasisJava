package by.bsu2.optional;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.Optional;
enum Ingredient {
    GARLIC(5), TOMATO, BACON(11);
    private int price;
    Ingredient(){
        System.out.println("bla");
    }
    Ingredient(int price){
        this.price = price;
        System.out.println(this.price);
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this +
                "price=" + price +
                '}';
    }
}
/**
 * Created by Ihar_Blinou on 3/29/2016.
 */
public class ItemMain {
    public static void main(String[] args) {
        Item defaultItem = new Item(0L, "empty", .0f);
        Long id = 71L;
        String nameItem = "gloves";
        float price = 20.0f;
        // возврщаемое значение метода getItem может быть null-ом
        Optional<Item> optItem = Optional.ofNullable(FactoryItem.getItem(id, nameItem, price));
        Item item1 = optItem.orElse(defaultItem);
        Item item2 = optItem.orElseGet(Item::new);
        Item itemEx = optItem.orElseThrow(IllegalArgumentException::new);

        //возвращается безопасный Optional-объект
        Optional<Item> optItem0 = FactoryItem.getItemOptional(id, nameItem, price);

        // Здесь все спокойно - возвращается безопасный Optional-объект

        Item item4 = null;
        if (optItem.isPresent()) { // если значения нет, возвращает false
            item4 = optItem.get();
            System.out.println(item4);//second output
        }
        optItem.ifPresent(s -> {
            System.out.println("Absolute path (nio): " );
            System.out.println("Absolute path (io): " );
        });
        BigDecimal big1 = new BigDecimal("0.15");
        System.out.println(big1);
//        String result1 = optional.orElse(BuildOptionalReader.DEFAULT_PATH);
//        System.out.println(result1);//third output
//
//        optional = BuildOptionalReader.buildPathSafe(null);
//        result1 = optional.orElse(BuildOptionalReader.DEFAULT_PATH);
//        System.out.println(result1);//fourth outputs

    }
}
