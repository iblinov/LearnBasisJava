package by.bsu2.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class LocalDateMain {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);
    localDate = localDate.plusDays(2)
                         .minusMonths(1)
                         .plusYears(1);
    System.out.println(localDate);
    System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
    System.out.println(localDate.format(DateTimeFormatter.ISO_ORDINAL_DATE));
    System.out.println(LocalTime.now());
    System.out.println(LocalDateTime.now());
    LocalDate localDate1 = LocalDate.of(2024, Month.APRIL, 9);
    LocalTime localTime = LocalTime.of(23, 59, 58);
    LocalDateTime localDateTime = LocalDateTime.of(localDate1, localTime);
    LocalDateTime localDateTime1 = LocalDateTime.of(2020, 03, 18, 23, 59, 59);
    LocalDate nowDate = LocalDate.now();
    LocalDate afterDate = LocalDate.of(2021, 12, 31);
    boolean after = nowDate.isAfter(afterDate);// false
    boolean before = nowDate.isBefore(afterDate);// true
    System.out.println(after + " " + before);

  }
}
