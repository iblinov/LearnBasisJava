package by.bsu2.java8.defaultstrategy.construct;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Main {
 public static Item maker(Supplier<Item> supplier) {

     return supplier.get();
 }

	public static void main(String[] args) {
		ItemFactoryMethod<Item> factory = Item::new;
		Item item = factory.createItem(18, "T-Shirt", 40);

        Supplier<Item> supplier = Item::new;
        Item item1 = supplier.get();

        Item item2=  maker(()-> factory.createItem(18, "T-Shirt", 40));

        String res = String.join(" : ", "shirt", "shoes", "boots");
        System.out.println(res);
        ArrayList<String> list = new ArrayList<String>(){
            {
                this.add("gloves");
                this.add("jersey");
                this.add("dress");
            }
        };
        String res2 = String.join(" -|- ", list);
        System.out.println(res2);

    }
}
