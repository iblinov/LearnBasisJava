package com.epam.matrix;

import java.util.Arrays;

public class MatMain {
  public static void main(String[] args) {
    MultiplyMatrix matrix = new MultiplyMatrix();
    int[][] a = {{1, 2, 3},
            {4, 5, 6}};
    int[][] b = {{7 , 8},
            {9 , 10},
            {11, 12}};
    int r[][] = matrix.multiply(a, b);
    for (int[]e: r
         ) {
      System.out.println(Arrays.toString(e));
    }
   
  }
}
