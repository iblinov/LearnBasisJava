package by.bsu2.optional;

import java.util.ArrayDeque;
import java.util.Optional;

public class OrderOptional {
    private ArrayDeque<Item> deque;// = new ArrayDeque<>();
    public Optional<Item> pollItem() {
        return Optional.ofNullable(deque.poll());
    }
    public boolean offerItem(Item item){
        return deque.offer(item);
    }
}
