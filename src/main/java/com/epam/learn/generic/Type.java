package com.epam.learn.generic;

import java.util.ArrayList;

public class Type <T>{
  T t;
}
class Main{
  public static void main(String[] args) {
    Type<String> type = new Type<>();
    Type<Integer> type1 = new Type<>();
    Type<ArrayList<Integer>> type2 = new Type<>();
    ArrayList<String> list = new ArrayList<>();
  //  list.add(1);
    list.add("fghh");
  }
}
