package com.epam.learn.operator;

/**
 * The type Bit main.
 */
public class BitMain {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    //   01
    //   10
    // -----
    //   00
   // System.out.println( a & b);
   // 10 <- 10000
    System.out.println(b << 3);
    // 10 -> 1
    System.out.println(b >> 1);
  }
}
