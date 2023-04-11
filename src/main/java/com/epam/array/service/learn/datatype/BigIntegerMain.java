package com.epam.array.service.learn.datatype;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerMain {
  public static void main(String[] args) {
    BigInteger n = new BigInteger("123456789012345678901234567890");
    System.out.println(n);
    BigInteger m = new BigInteger("123456789012345678901234567891");
    BigInteger a = n.add(m);
    System.out.println(a);
    BigInteger mult = n.multiply(m);
    System.out.println(mult);
    BigInteger rand = new BigInteger(100, new Random());
    System.out.println(rand);
    BigInteger rand1 = new BigInteger(100, new Random());
    System.out.println(rand1);
  }
}
