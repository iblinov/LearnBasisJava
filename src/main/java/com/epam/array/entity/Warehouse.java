package com.epam.array.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
  private static final Warehouse instance = new Warehouse();
  private Map<Integer, ArrayStatistics> map = new HashMap<>();

  private Warehouse() {
  }

  public static Warehouse getInstance() {
    return instance;
  }

  public ArrayStatistics put(Integer key, ArrayStatistics value) {
    return map.put(key, value);
  }

  public ArrayStatistics remove(Object key) {
    return map.remove(key);
  }

  public ArrayStatistics replace(Integer key, ArrayStatistics value) {
    return map.replace(key, value);
  }
}
