package com.epam.array.reader;

import com.epam.array.exception.CustomException;

public interface ArrayReader {
  int[] readArray(String filename);
  int[] readArray7(String filename) throws CustomException;
}
