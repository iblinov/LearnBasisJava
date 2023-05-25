package com.epam.lines.service;

import com.epam.lines.model.Line;
import com.epam.lines.service.impl.LineServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.*;

public class LineServiceImplTest {

  @Test()
  public void findLengthPositive() {
    double expected = 5;
    Line line = new Line(0, 0, 3, 4);
    LineServiceImpl service = new LineServiceImpl();
    double actual = service.findLength(line);
    assertEquals(expected, actual, 0.000001);
  }

  @Test()
  public void findLengthNegative() {
    //Assertions.fail("abc");
  }


  @ParameterizedTest
  @CsvSource({ "racecar,7", "radar,5", "able was I ere I saw elba,1" })
  void palindromes(String input, int expected) {
   assertEquals(input.length(), expected);

  }
  @ParameterizedTest
  @CsvSource({ "1, 2 ,2", "1, 2, 5", "1, 2, 3 ,3" })
  void test2(Data input, int expected) {
    assertEquals(input.getArr(), expected);

  }

  static class Data{
    private int[] arr;
    Data(int ... a) {
      arr = a;
    }

    public int[] getArr() {
      return arr;
    }
  }
  @ParameterizedTest
  @CsvSource({"test,TEST", "tEscvt,TEST", "Java,JAVA"})
  void toUpperCaseShouldGenerateTheExpectedUppercaseValue(String input, String expected) {
    String actualValue = input.toUpperCase();
    assertEquals(expected, actualValue);
  }
}