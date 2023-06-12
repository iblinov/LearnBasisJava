package com.epam.learn.gift.reader;

import com.epam.learn.gift.entity.Chocolate;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ChocoladePropertiesReader {
  public Chocolate propertyRead() {
    Properties properties = new Properties();
    Chocolate chocolate = new Chocolate();
    try {
      properties.load(new FileReader("res\\sweetdata2.properties"));
      System.out.println(properties);
      System.out.println(properties.values());
      System.out.println(properties.elements());
      System.out.println(properties.entrySet());
     // chocolate.setWeightGram(Integer.parseInt(properties.getProperty("weight")));
//      chocolate.setSweetId(Integer.parseInt(properties.getProperty("id")));
//      chocolate.setSugarPercent(Integer.parseInt(properties.getProperty("sugar")));
//      chocolate.setPorous(Boolean.parseBoolean(properties.getProperty("porous")));
//      chocolate.setType(Chocolate.Type.valueOf(properties.getProperty("type").toUpperCase()));
    } catch (IOException e) {
      System.err.println(e);;
    }
    return chocolate;
  }
  public Chocolate propertyReadBundle() {
    ResourceBundle rb = ResourceBundle.getBundle("res\\sweetdata");
    Chocolate chocolate = new Chocolate();
    String key = rb.getString("id");
    System.out.println(key);
    //String[] arr =
    System.out.println(rb.getStringArray("id"));
   // System.out.println(Arrays.toString(arr));
    return chocolate;
  }
}
