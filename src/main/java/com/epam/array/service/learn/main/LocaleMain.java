package com.epam.array.service.learn.main;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleMain {
  public static void main(String[] args) {
    Locale locale = new Locale("fr");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("res.sweetdata2", locale);
    System.out.println(resourceBundle.getString("submit1"));
    Date date = new Date();
    double d = 1_234_567.891;
    Locale[] locales = DateFormat.getAvailableLocales();
    for (Locale loc : locales) {
      DateFormat format = DateFormat.getDateInstance(DateFormat.FULL, loc);
      NumberFormat numberFormatUs = NumberFormat.getInstance(loc);
      System.out.print(numberFormatUs.format(d) + "    ^^^^^^^  ");
      System.out.println(loc.toString() + "---> " + format.format(date));
    }
  }
}
