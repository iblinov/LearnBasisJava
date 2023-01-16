package com.epam.array.reader.impl;

import com.epam.array.reader.ArrayReader;
import com.epam.array.validator.StringArrayValidator;
import com.epam.array.validator.impl.StringArrayValidatorImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ArrayReaderImpl implements ArrayReader {
  private static final String DEFAULT_FILENAME = "data\\arrays.txt";
  public int[] readArray(String filename) {
    int[] arrTemp = null;
    Path path = Path.of(filename);
   if(!Files.exists(path)) {
     System.out.println("file " + filename + " not exist");
     filename = DEFAULT_FILENAME;
   }
    BufferedReader reader = null;

    try  {
       reader = new BufferedReader(new FileReader(filename));
      String tmp;
      if ((tmp = reader.readLine()) != null) { //java 2
        System.out.println(tmp);
        String[] str = tmp.split("\\s+");
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);
        arrTemp = new int[str.length];
        int counter = 0;
        StringArrayValidator validator = new StringArrayValidatorImpl();
        for (int i = 0; i < str.length; i++) {
            if(validator.stringNumberValidate(str[i])) {
              arrTemp[counter] = Integer.parseInt(str[i]);
              counter++;
            }
        }
        System.out.println(Arrays.toString(arrTemp));
        int [] arrres = Arrays.copyOf(arrTemp, counter);
        System.out.println(Arrays.toString(arrres));
      }
    } catch (IOException  e) {
      System.err.println(e);
    } finally {
      if(reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          //
        }
      }
    }
    return arrTemp;
  }
}
