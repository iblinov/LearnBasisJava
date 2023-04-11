package com.epam.matrix;

public class MultiplyMatrix {
  public int[][] multiply(int[][] p, int[][] q)  {
    int v = p.length;
    int h = q[0].length;

    int[][] result = new int[v][h];

      for (int i = 0; i < v; i++) {
        for (int j = 0; j < h; j++) {
          int value = 0;
          for (int k = 0; k < p[0].length; k++) {
            value += p[i][k] * q[k][j];
          }
          result[i][j] =value;
        }
      }
//    StringBuilder s = new StringBuilder("{{");
//    for (int [] row : result) {
//      for (int value : row) {
//        s.append(value).append(", ");
//      }
//      s.append("}");
//    }
//    System.out.println(s.toString() +"}");
//

      return result;
  }
}

