package com.epam.learn.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Comparator<String> comparator = new Comparator<>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    };
    Comparator<String> comparator2 = (String o1, String o2) -> {
        return o1.length() - o2.length();
    };
    Comparator<String> comparator3 = (String o1, String o2) -> o1.length() - o2.length();
    Comparator<String> comparator4 = (o1, o2) -> o1.length() - o2.length();
    List<String> strings = new ArrayList<>();//List.of("jhkjh", "jjj", "h", "kjhh", "oppi", "hghig", "aaa");
    strings.add("hhhyuy");
    strings.add("yhh");
    strings.add("bhhyyyyyy");
    strings.add("xh");
    strings.add("khhtt");
    strings.sort((o1, o2) -> o1.length() - o2.length());
    System.out.println(strings);
    strings.sort(String::compareTo);
    System.out.println(strings);
  }
}
