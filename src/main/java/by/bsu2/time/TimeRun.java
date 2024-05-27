package by.bsu2.time;

import java.time.Instant;
import java.time. LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeRun {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MM yyyy");
        String date = "31 03 2020";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String date2 = "18-March-2020";
        LocalDate localDate2 = LocalDate.parse(date2, formatter2);

        System.out.println(localDate2);  //default, print ISO_LOCAL_DATE
        System.out.println(formatter2.format(localDate2));

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("E, MMM d yyyy");
        String date3 = "Fri, May 25 2018";
        LocalDate localDate3 = LocalDate.parse(date3, formatter3);
        System.out.println(localDate3);
        System.out.println(formatter3.format(localDate3));

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm:ss a");
        String date4 = "Monday, May 25, 2020 10:30:56 AM";
        LocalDateTime localDateTime4 = LocalDateTime.parse(date4, formatter4);
        System.out.println(localDateTime4);
        System.out.println(formatter4.format(localDateTime4));
        Instant instant =  Instant.now();
        System.out.println(instant);
    }
}
