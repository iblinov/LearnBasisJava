package com.epam.array.service.learn.datatype;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalMain {
  public static void main(String[] args) {
    double d1 = 0.3;
    double d2 = 0.1;
    double res = d1 - d2;
    System.out.println(res);
//    BigDecimal bd1 = new BigDecimal(0.3, MathContext.DECIMAL32);
//    BigDecimal bd2 = new BigDecimal(0.1, MathContext.DECIMAL32);
//    BigDecimal result = bd1.subtract(bd2);
//    System.out.println(result);
    BigDecimal bd1 = new BigDecimal(0.3);
    BigDecimal bd2 = new BigDecimal(0.1);
    BigDecimal result = bd1.subtract(bd2);
    System.out.println(result.setScale(2, RoundingMode.CEILING));
  }
}
