package by.bsu2.threads.future;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProductStore {
    private static BlockingQueue<String> deque = new ArrayBlockingQueue<>(5);

    static {
        deque.add("Product 1");
        deque.add("Product 2");
        deque.add("Product 3");
        deque.add("Product 4");
        deque.add("Product 5");
    }
    public static String poll() {
        return deque.poll();
    }
}
