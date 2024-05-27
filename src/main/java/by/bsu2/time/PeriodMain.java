package by.bsu2.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
  public static void main(String[] args) {
    LocalDate before = LocalDate.of(2020, 3, 25);
    LocalDate nowDate = LocalDate.now();
    System.out.println(nowDate);
    Period period = Period.between(nowDate, before);
    System.out.println(period);
    System.out.println(period.getDays());
  }
}
