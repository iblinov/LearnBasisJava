package edu.itacademy.first.main;

import edu.itacademy.first.entity.Ball;

class ProjectMain {
  public static void main(String[] args) {
    Ball ball = new Ball(2, "steel","red", 5.2);
    ball.setRadius(3);
    System.out.println(ball);
  }
}
