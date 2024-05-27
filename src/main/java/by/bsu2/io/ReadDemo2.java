package by.bsu2.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadDemo2 {
  public static void main(String[] args) {
    try(BufferedReader reader
                = new BufferedReader(new FileReader("data\\t.txt"))) {
//      String str;
//      while((str=reader.readLine()) != null) {
//        System.out.println(str);
//      }
      Object[] array=reader.lines().toArray();//  forEach(System.out::println);
      System.out.println( Arrays.toString(array));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
