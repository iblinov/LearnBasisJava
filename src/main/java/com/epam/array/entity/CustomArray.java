package com.epam.array.entity;

import com.epam.array.observer.ArrayStatisticsObserver;
import com.epam.array.observer.impl.ArrayStatisticsObserverImpl;
import com.epam.array.util.IdGenerator;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.StringJoiner;

public class CustomArray {
  private int arrayId;
  private int[] array;
  private ArrayStatisticsObserver observer;

  public CustomArray(int[] array) {
    setArray(array);
    arrayId = IdGenerator.generateId();
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    CustomArray that = (CustomArray) o;

    if (arrayId != that.arrayId) return false;
    if (!Arrays.equals(array, that.array)) return false;
      return Objects.equals(observer, that.observer);
  }

  @Override
  public int hashCode() {
    int result = arrayId;
    result = 31 * result + Arrays.hashCode(array);
    result = 31 * result + (observer != null ? observer.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
            .add("arrayId=" + arrayId)
            .add("array=" + Arrays.toString(array))
            .toString();
  }
}
