package by.bsu2.java8.functional.interfaces;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.Comparator;

public class ItemIdComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getId() - o2.getId();
    }
}
