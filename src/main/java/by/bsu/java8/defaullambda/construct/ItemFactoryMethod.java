package by.bsu.java8.defaullambda.construct;

public interface ItemFactoryMethod <T extends Item> {
	T createItem(int id, String name, double price);
}
