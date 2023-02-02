package main;

import dish.Bill;
import dish.Pizza;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Pizza pizza1 =
            new Pizza(true, false, true, true, false, true, false, true, true);
    Pizza pizza2 = new Pizza(true, false, true, true, false, true, false, true, false);
    System.out.println(pizza1);
    System.out.println(pizza2);
    Bill bill = new Bill();
    String res1 = bill.createBill(pizza1);
    String res2 = bill.createBill(pizza2);
    System.out.println(res1);
    System.out.println(res2);

    String s = "java";
    char c = s.charAt(0);
    String s1 = Character.toString(c).toUpperCase();
    System.out.println(s1 + s.substring(1));

    String[] arr = s.split("");
    arr[0] = arr[0].toUpperCase();
    String res = Arrays.stream(arr).reduce("", (s2, s3) -> s2 + s3);
    System.out.println(res);

    String res3 = String.join("", arr);
    System.out.println(res3);
    //  StringJoiner jo = new StringJoiner("","","").add(arr);


  }
}