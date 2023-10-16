package edu.itacademy.first.main;

import edu.itacademy.first.creator.BallArrayFactory;
import edu.itacademy.first.entity.BallTwo;

import java.util.UUID;

public class TwoMain {
  public static void main(String[] args) {
    BallTwo[] ballTwos = BallArrayFactory.createBalls(5, 1, 3.);
    for (int i = 0; i < ballTwos.length; i++) {
      System.out.println(ballTwos[i]);
    }
    UUID uuid = UUID.fromString("f973952c-c2be-46c7-9316-ecda047");
    System.out.println(uuid);
    String s = uuid.toString();
    int index = s.indexOf("-");
    s = s.substring(0, index);
    System.out.println(s);
  }
}
