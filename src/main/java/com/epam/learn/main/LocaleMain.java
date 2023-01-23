package com.epam.learn.main;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleMain {
  public static void main(String[] args) {
    Locale locale = new Locale("fr");
    ResourceBundle resourceBundle = ResourceBundle.getBundle("res.sweetdata2", locale);
    System.out.println(resourceBundle.getString("submit1"));
  }
}
