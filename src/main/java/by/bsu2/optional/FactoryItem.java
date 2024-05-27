package by.bsu2.optional;

import java.util.Optional;


public class FactoryItem {
        public static Item getItem(Long itemId, String name, float price) {
            Item item = null;
            if (Validator.checkItemParameter(itemId, name, price)) {
                item = new Item(itemId, name, price);
            }
            return item;
        }

    public static Optional<Item> getItemOptional(Long itemId, String name, float price) {

        if (Validator.checkItemParameter(itemId, name, price)) {
            return Optional.of(new Item(itemId, name, price));
        }
        return Optional.empty();
    }
}
