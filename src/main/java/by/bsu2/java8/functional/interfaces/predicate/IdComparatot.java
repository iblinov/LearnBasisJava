package by.bsu2.java8.functional.interfaces.predicate;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.util.Comparator;

/**
 * Created by Ihar_Blinou on 2/20/2017.
 */
public class IdComparatot implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {

        int id1 = o1.getId();
        int id2 = o2.getId();
        int res = 0;
        if(id1<id2) {
            res = -1;
        } else if (id1>id2) {
            res = 1;
        }
        return res;
    }
}
