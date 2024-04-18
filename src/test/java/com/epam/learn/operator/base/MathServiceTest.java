package com.epam.learn.operator.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

class MathServiceTest {

  @Test
 public void methodPositive() {
    MathService mathService = new MathService();
    byte actual = mathService.method((byte)4);
    byte expected = 12;
    assertEquals(expected, actual);
  }
  @Test
  public void methodNegative()  {
//    Executable executable = new Executable() {
//      @Override
//      public void execute() throws Throwable {
//        MathService mathService = new MathService();
//        mathService.method((byte)50);
//      }
//    };
//   assertThrows(IllegalArgumentException.class,executable);
    assertThrows(IllegalArgumentException.class, () -> new MathService().method((byte)50));
  }
}