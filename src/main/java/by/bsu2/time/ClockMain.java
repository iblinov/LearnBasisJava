package by.bsu2.time;

import java.time.Clock;
public class ClockMain {
  public static void main(String[] args) {
    Clock clock = Clock.systemDefaultZone();
    System.out.println(clock.instant());
    System.out.println(clock.millis());
  }
}
