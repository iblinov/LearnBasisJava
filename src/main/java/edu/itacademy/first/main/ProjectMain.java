package edu.itacademy.first.main;

import edu.itacademy.first.entity.Ball;
import edu.itacademy.first.service.BallService;

class ProjectMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2, "steel", "red", 5.2);
        Ball ball2 = new Ball(7, "iron", "white", 1.0);
        Ball ball3 = new Ball(1, "steel", "red", 3.2);
        Ball ball4 = new Ball(1, "steel", "red", 3.2);

        Ball[] balls = new Ball[4];
        balls[0] = ball3;
        balls[1] = ball;
        balls[2] = ball2;
        balls[3] = ball4;

        //  balls = null;
        //   balls[2] = ball;

//    for (int i = 0; i < balls.length; i++) {
//      System.out.println(balls[i]);
//    }
//    int[] numbers = new int[5];
//    numbers[3] = 56;
//    for (int i = 0; i < numbers.length; i++) {
//      System.out.println(numbers[i]);
//    }
        //   System.out.println(ball);
        BallService service = new BallService();
        double result = service.defineWeightBalls(balls);
        System.out.println(result);
        System.out.println((int) result);
        System.out.println(Math.round(result));
        int resulColor = service.findBallByColor(balls, "gr");
        System.out.println(resulColor);
    }
}
