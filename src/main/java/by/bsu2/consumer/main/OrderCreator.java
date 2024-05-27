package by.bsu2.consumer.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Ihar_Blinou on 2/5/2015.
 */
public class OrderCreator {
    public static Map<String, Integer> createContentOrder() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Random random = new Random();
        map.put("T-Shirt", random.nextInt(3));
        map.put("Gloves", random.nextInt(3));
        map.put("Jeans", random.nextInt(3));
        return map;
    }
}
