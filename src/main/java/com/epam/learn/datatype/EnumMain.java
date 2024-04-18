package com.epam.learn.datatype;

public class EnumMain {
  enum State {
    ONE, ZERO
  }
  public static void main(String[] args) {
    State s1 = State.ZERO;
    State s2 = State.ONE;
    State s = State.valueOf("ONE");
    System.out.println(s2.compareTo(s1));
  }
}
