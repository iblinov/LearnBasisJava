package com.epam.learn.gift.service;

import com.epam.learn.gift.entity.Gift;
import com.epam.learn.gift.entity.Sweet;

import java.util.List;

public class GiftService {
  public int calculateWeight(Gift gift) {
    int sum = 0;
    List<Sweet> sweets = gift.getList();
    for (Sweet s :  sweets) {
      sum += s.getWeightGram();
    }
    return sum;
  }
}
