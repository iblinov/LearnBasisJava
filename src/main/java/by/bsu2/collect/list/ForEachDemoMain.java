package by.bsu2.collect.list;

import java.util.ArrayList;

public class ForEachDemoMain {
  public static void main(String[] args) {
    ArrayList<StringBuilder> list = new ArrayList<StringBuilder>() {
      {
        this.add(new StringBuilder("one"));
        this.add(new StringBuilder("two"));
        this.add(new StringBuilder("three"));
        this.add(new StringBuilder("four"));
        this.add(new StringBuilder("five"));
      }
    };

    list.removeIf((o) -> o.toString().length() < 4);
    list.forEach(o -> o.append(" 1"));
    System.out.println(list);
    list.stream().forEach(o -> o.append(" 2"));

    System.out.println(list);
  }
}
