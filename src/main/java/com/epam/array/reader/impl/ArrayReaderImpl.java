package com.epam.array.reader.impl;

import com.epam.array.exception.CustomException;
import com.epam.array.reader.ArrayReader;
import com.epam.array.validator.StringArrayValidator;
import com.epam.array.validator.impl.StringArrayValidatorImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class ArrayReaderImpl implements ArrayReader {
  private static final String DEFAULT_FILENAME = "data\\arrays.txt";
  private static final String SPACE_DELIMITER = "\\s+";

  @Override
  public int[] readArray(String filename, Charset... charset) {
    Path path = Path.of(filename);
    if (!Files.exists(path)) {
      System.out.println("file " + filename + " not exist");
      filename = DEFAULT_FILENAME;// or ArrayException
    }
    BufferedReader reader = null;
    int[] arrTemp = null;
//    if (charset.length == 0) {
//      charset[0] = StandardCharsets.UTF_8;
//    }
    try {
      reader = new BufferedReader(new FileReader(filename));
      String tmp;
      if ((tmp = reader.readLine()) != null) {
        System.out.println(tmp);
        String[] str = tmp.split(SPACE_DELIMITER);
        System.out.println(Arrays.toString(str));
        System.out.println(str.length);
        arrTemp = new int[str.length];
        int counter = 0;
        StringArrayValidator validator = new StringArrayValidatorImpl();
        for (int i = 0; i < str.length; i++) {
          if (validator.stringNumberValidate(str[i])) {
            arrTemp[counter] = Integer.parseInt(str[i]);
            counter++;
          }
        }
        System.out.println(Arrays.toString(arrTemp));
        int[] arrRes = Arrays.copyOf(arrTemp, counter);
        System.out.println(Arrays.toString(arrRes));
      }
    } catch (IOException e) {
      System.err.println(e);
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          //
        }
      }
    }
    return arrTemp;
  }

  @Override
  public int[] readArray7(String filename) throws CustomException {
    Path path = Path.of(filename);
    if (!Files.exists(path)) {
      System.out.println("file " + filename + " not exist");
      filename = DEFAULT_FILENAME;// or Exception
    }
    Path path2 = FileSystems.getDefault().getPath(filename);
    int[] result;
    try {//java7
      List<String> lines = Files.readAllLines(path2);
      System.out.println(lines);
      StringArrayValidator validator = new StringArrayValidatorImpl();
      for (int i = 0; i < lines.size(); i++) {
        String strNum = lines.get(i);
        if (validator.stringArrayValidate(strNum)) {
          String[] numArr = strNum.split(SPACE_DELIMITER);
          result = new int[numArr.length];
          for (int j = 0; j < numArr.length; j++) {
            result[j] = Integer.parseInt(numArr[j]);
          }
          return result;
        }
      }
    } catch (IOException e) {
      //log
      throw new CustomException(" msg", e);
    }
    //log
    throw new CustomException("file have't correct lines");
  }
}
