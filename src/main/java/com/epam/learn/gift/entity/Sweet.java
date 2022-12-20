package com.epam.learn.gift.entity;

import java.util.StringJoiner;

public abstract class Sweet {
   private int weightGram;
   private int sugarPercent;

  public Sweet() {
  }

  public Sweet(int weightGram, int sugarPercent) {
    this.weightGram = weightGram;
    this.sugarPercent = sugarPercent;
  }

  public int getWeightGram() {
    return weightGram;
  }

  public void setWeightGram(int weightGram) {
    this.weightGram = weightGram;
  }

  public int getSugarPercent() {
    return sugarPercent;
  }

  public void setSugarPercent(int sugarPercent) {
    this.sugarPercent = sugarPercent;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ",  "[", "]")
            .add("weightGram=" + weightGram)
            .add("sugarPercent=" + sugarPercent)
            .toString();
  }
}
