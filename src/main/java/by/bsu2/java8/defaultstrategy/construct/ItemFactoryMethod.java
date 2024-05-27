package by.bsu2.java8.defaultstrategy.construct;

public interface ItemFactoryMethod <T extends Item> {
	T createItem(int id, String name, double price);
//    T createItem();
}
