package by.bsu.java8.defaullambda.construct;

public class Main {

	public static void main(String[] args) {
		ItemFactoryMethod<Item> factory = Item::new;
		Item item = factory.createItem(18, "T-Shirt", 40);
	}
}
