package by.bsu2.anonym;

import by.bsu2.java8.defaultstrategy.construct.Item;

import java.math.BigDecimal;

public class DefinerMain {
    public static void main(String[] args) {
        Item item = new Item(334, "Gloves", 12.);
        DiscountDefiner definer = new DiscountDefiner();
        float value = definer.definerReal(15, item);
        System.out.println(value);
        DiscountDefiner definerHigh = new DiscountDefiner() {
            @Override
            public float definerReal(int percent, Item item){
                BigDecimal big = new BigDecimal(1f)
                        .add(new BigDecimal(percent/100f).negate())
                        .multiply(new BigDecimal(item.getPrice()));
                float result = big.floatValue();
                return result;
            }
        };
        System.out.println(definerHigh.definerReal(15, item));
    }
}
