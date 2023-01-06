package com.epam.array.reader.impl;

import com.epam.array.reader.ArrayReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ArrayReaderImpl implements ArrayReader {
  private static final String DEFAULT_FILENAME = "data\\arrays.txt";
  public int[] readArray(String filename) {
    int[] arr = null;
    Path path = Path.of(filename);
   if(!Files.exists(path)) {
     System.out.println("file " + filename + " not exist");
     filename = DEFAULT_FILENAME;
   }
    try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
      String tmp;
      if ((tmp = reader.readLine()) != null) { //java 2
        System.out.println(tmp);
        String[] str = tmp.split("\\s+");
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);
        arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
          try {
            arr[i] = Integer.parseInt(str[i]);
          } catch (NumberFormatException e) {
            System.err.println(e);
          }
        }
      }
    } catch (IOException  e) {
      System.err.println(e);
    }
    return arr;
  }
}
