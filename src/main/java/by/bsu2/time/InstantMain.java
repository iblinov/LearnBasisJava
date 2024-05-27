package by.bsu2.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class InstantMain {
  public static void main(String[] args) {
    Instant instant = Instant.now();// create Instant
    System.out.println(instant);// date, time
    instant = Instant.parse("2020-03-17T14:27:32.728500600Z");// parsing string
    System.out.println(instant);
    long millis = System.currentTimeMillis();// current time in millisec
    System.out.println(millis);
    instant = Instant.ofEpochMilli(millis);//milliseconds to date time conversion
    System.out.println(instant);
    LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());// conversion to LocalDate
    System.out.println(localDate);
  }
}
