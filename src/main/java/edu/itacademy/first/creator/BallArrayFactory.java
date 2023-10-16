package edu.itacademy.first.creator;

import edu.itacademy.first.entity.BallTwo;
import edu.itacademy.first.entity.Color;

import java.util.Random;

public class BallArrayFactory {

  public static BallTwo[] createBalls(int size, double originWeight, double borderWeight) {
    BallTwo[] balls = new BallTwo[size];
    Random random = new Random();
    Color[] colors = Color.values();
    int colorBorder = colors.length;
    for (int i = 0; i < size; i++) {
      BallTwo ball = new BallTwo();
      double weight = random.nextDouble(originWeight, borderWeight);
      ball.setWeight(weight);
      int colorRandom = random.nextInt(colorBorder);
      Color currunt = colors[colorRandom];
      ball.setColor(currunt);
      balls[i] = ball;
    }

    return balls;
  }
}
