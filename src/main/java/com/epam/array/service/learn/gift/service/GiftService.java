package com.epam.array.service.learn.gift.service;

import com.epam.array.service.learn.gift.entity.Gift;
import com.epam.array.service.learn.gift.entity.Sweet;

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
