package com.epam.array.service.learn.gift.comparator;

import com.epam.array.service.learn.gift.entity.Sweet;

import java.util.Comparator;

public class IdComparator implements Comparator<Sweet> {
  @Override
  public int compare(Sweet o1, Sweet o2) {
    return o1.getSweetId() - o2.getSweetId();
  }
}
