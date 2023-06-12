package com.epam.learn.gift.comparator;

import com.epam.learn.gift.entity.Chocolate;

import java.util.Comparator;

public class WeightComparator implements Comparator<Chocolate> {
  @Override
  public int compare(Chocolate o1, Chocolate o2) {
    return o2.getWeightGram()- o1.getWeightGram();
  }
}
