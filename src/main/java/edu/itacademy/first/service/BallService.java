package edu.itacademy.first.service;

import edu.itacademy.first.entity.Ball;

public class BallService {
  public double defineWeightBalls(Ball[] balls){
//    if (balls == null) {
//      return -1;
//    }
     double total = 0;
    for (int i = 0; i < balls.length; i++) {
      total += balls[i].getWeight();
    }
    return total;
  }

  public int findBallByColor(Ball[] balls, String color) {
    int total = 0;
    for (int i = 0; i < balls.length; i++) {
      if(balls[i].getColor().equals(color)) {
        total++;
      }
    }
    return total;
  }
}
