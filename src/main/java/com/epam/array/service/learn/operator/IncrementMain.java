package com.epam.array.service.learn.operator;

/**
 * The type Increment main.
 */
public class IncrementMain {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int a = 1;

    System.out.println(a-- + --a);
    System.out.println(a);
  }
}
