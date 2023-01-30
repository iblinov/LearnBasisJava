package com.epam.array.entity;

import com.epam.array.observer.ArrayStatisticsObserver;
import com.epam.array.observer.impl.ArrayStatisticsObserverImpl;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;

public class CustomArray {
  private int arrayId;
  private int[] array;
  private ArrayStatisticsObserver observer;

  public CustomArray(int[] array) {
    setArray(array);
    observer = new ArrayStatisticsObserverImpl();
  }
  public void revomeObserver() {
    observer = null;
  }
  public void addObserver() {
    observer = new ArrayStatisticsObserverImpl();
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
  public void setElement(int index, int value) {
    array[index] = value;
    notifyObserver();
  }
  public void setArray(int[] array) {
    if(array != null && array.length > 0) {
      this.array = array;
    } else {
      this.array = new int[]{0};
    }
    notifyObserver();
  }

  private void notifyObserver() {
    if (observer != null) {
      observer.changeArrayElement(this);
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
