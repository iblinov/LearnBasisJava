package main;

import java.util.HashMap;
import java.util.UUID;

public class OutOgMemMain {
  public static void main(String[] args) {
    try {
      HashMap<String, String> map = new HashMap<>();
      String s1 = "errrr";
      String s2 = "kp[k[k[";
      while (true){
        s1+= "hhhhhhhhhhhhhhh";
        s2+= "opjpjpijpijiiiiiii";
        map.put(s1, s2);
      }
    } catch (Throwable t) {
      System.out.println("--------->" + t);
    } finally {
      System.out.println("------------------finally-------------");
    }
  }
}
