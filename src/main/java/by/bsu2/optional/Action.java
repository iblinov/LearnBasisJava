package by.bsu2.optional;
import java.util.Optional;

public class Action {

  public Action() {

  }
  public Item correctPriceTraditional(Item item, double discount) {
    Item result;
    double newPrice = item.getPrice() - discount;
    if(newPrice > 0) {
   //   result = item.clone();
      item.setPrice(newPrice);
    } else {
      result = null;// or throw exception
    }
    return item;
  }
  public Optional<Item> correctPrice(Item item, double discount) {
    Optional<Item> optional;
    ///  bla bla

    if(item != null) {
      optional = Optional.of(item);
    } else {
      optional = Optional.empty();
    }
    return optional;
            //Optional.ofNullable(item);
  }
}