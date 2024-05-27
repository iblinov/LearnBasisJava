package by.bsu2.collect.map;

import java.util.HashMap;
import java.util.Map;

public class MapMethds {

  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();
    map.put("Jeans", 40); // adding a pair map.put("T-Shirt", 35);
    map.put("Gloves", 42);
    map.compute("Shoes", (k, v) -> 77); // adding a pair
    System.out.println(map);
// replacing value if key exists
 map.computeIfPresent("Shoes", (k,v) -> v + k.length());
 System.out.println(map);
    map.computeIfAbsent("Shoes", v -> 11);
// adding a pair if the key is missing
    map.computeIfAbsent("Shoes_2", v -> 11);
    System.out.println(map);
  }
}
