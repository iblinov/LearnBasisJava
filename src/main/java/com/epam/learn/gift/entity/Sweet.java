package com.epam.learn.gift.entity;

import java.util.StringJoiner;

public abstract class Sweet extends Object {
   private int sweetId;
   private int weightGram;
   private int sugarPercent;

  public Sweet() {
  }

  public Sweet(int sweetId, int weightGram, int sugarPercent) {
    this.sweetId = sweetId;
    this.weightGram = weightGram;
    this.sugarPercent = sugarPercent;
  }

  public int getSweetId() {
    return sweetId;
  }

  public int getWeightGram() {
    return weightGram;
  }

  public int getSugarPercent() {
    return sugarPercent;
  }

  public void setSweetId(int sweetId) {
    this.sweetId = sweetId;
  }

  public void setWeightGram(int weightGram) {
    this.weightGram = weightGram;
  }

  public void setSugarPercent(int sugarPercent) {
    this.sugarPercent = sugarPercent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Sweet sweet = (Sweet) o;

    if (sweetId != sweet.sweetId) return false;
    if (weightGram != sweet.weightGram) return false;
    return sugarPercent == sweet.sugarPercent;
  }

  @Override
  public int hashCode() {
    int result = sweetId;
    result = 31 * result + weightGram;
    result = 31 * result + sugarPercent;
    return result;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", "[", "]")
            .add("id=" + sweetId)
            .add("gram=" + weightGram)
            .add("sugar=" + sugarPercent)
            .toString();
  }
}
