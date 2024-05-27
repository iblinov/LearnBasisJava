package by.bsu2.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DurationMain {
  public static void main(String[] args) {
    LocalTime time06am = LocalTime.of(6, 0, 0);
    LocalTime time23am = LocalTime.of(23, 15, 30);
    Duration duration = Duration.between(time06am, time23am);
    System.out.println(duration.toHours() + " hours"); // 17

    LocalDate newYear = LocalDate.of(2020, 1, 1);
    LocalDate today = LocalDate.of(2020, 9, 13);
    long daysToToday = ChronoUnit.DAYS.between(newYear, today);
    System.out.println(daysToToday + " days"); // 256
  }
}

