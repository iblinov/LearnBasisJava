package com.epam.array.entity;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class CustomArray {
  private int arrayId;
  private int[] array;

  public CustomArray(int[] array) {
    setArray(array);
  }

  public int getArrayId() {
    return arrayId;
  }

  public void setArrayId(int id) {
    if(arrayId > 0) {
      arrayId = id;
    } else {
      this.arrayId = new Random().nextInt();
    }
  }

  public int[] getArray() {
    return array;
  }

  public void setArray(int[] array) {
    if(array != null && array.length > 0) {
      this.array = array;
    } else {
      this.array = new int[]{0};
    }
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
            .add("arrayId=" + arrayId)
            .add("array=" + Arrays.toString(array))
            .toString();
  }
}
