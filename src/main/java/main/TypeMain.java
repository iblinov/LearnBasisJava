package main;

import java.util.Arrays;

public class TypeMain {
  public static void main(String[] args) {

    int x = 0;
    int y = 0;
    System.out.println(switch (x){
      case 3, 5 -> x++;
      case 0 -> ++x;
      case 2 -> x++;
      case 1 -> x++;
      default -> x++;
    });
    System.out.println(x + " " + y);
    int[] a = {2, 4, 6};
    int sum = 0;
    for (int elem : a) {
      elem += 5;
      sum += elem;
      elem += 10;
    }
    System.out.println(sum);
    System.out.println(a);
    System.out.println(Arrays.toString(a));
    if (args.length > 0) {

      double d = 1.2e-9;
      float f = (float) 2.3;
      char ch = '\uaaaa';
      boolean b = true;
      var g = 'h';
      g--;
      int var = 7;
      var();
      String string = "";
    }
  }

  static void var() {
  }
}
