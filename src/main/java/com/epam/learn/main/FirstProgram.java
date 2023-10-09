package com.epam.learn.main;

public class FirstProgram {
  public static void main(String[] args) {
    System.out.println("hello");
    System.out.println(42);
    System.out.println("\n\tjava " + 16);
    int num = 5;
    do { num++; }
    while (++num < 6);
    System.out.println(num);
  }
}
enum Size {
  SMALL(50), MEDIUM(100), BIG(150);
  private final int max;

  Size(int max) {
    this.max = max;
  }

}