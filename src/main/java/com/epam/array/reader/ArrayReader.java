package com.epam.array.reader;

import com.epam.array.exception.CustomException;

import java.nio.charset.Charset;

public interface ArrayReader {
  int[] readArray(String filename, Charset ... charset);
  int[] readArray7(String filename) throws CustomException;
}
