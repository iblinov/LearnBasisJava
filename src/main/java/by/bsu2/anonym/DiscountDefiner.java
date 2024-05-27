package by.bsu2.anonym;

import by.bsu2.java8.defaultstrategy.construct.Item;

public class DiscountDefiner {
    public float definerReal(int percent, Item item) {
        float result = (float) item.getPrice() * (1f - percent/100f);
        return result;
    }
}
