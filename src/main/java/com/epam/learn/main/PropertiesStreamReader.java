package com.epam.learn.main;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

public class PropertiesStreamReader {
  private File getFileFromResource(String fileName) throws URISyntaxException {
    URL resource = getClass().getClassLoader().getResource(fileName);
    System.out.println(resource);
    if (resource == null) {
      throw new IllegalArgumentException("file not found! " + fileName);
    }
      // failed if files have whitespaces or special characters
      //return new File(resource.getFile());
      return new File(resource.toURI());
  }
  public static void main(String[] args) throws URISyntaxException {
    PropertiesStreamReader ob = new PropertiesStreamReader();
    File f = ob.getFileFromResource("res/sweetdata.properties");
    System.out.println(f.exists());
    System.out.println(ob.readStream("res/sweetdata.properties"));
    }
    private String readStream(String fileName){
      InputStream input = getClass().getClassLoader().getResourceAsStream(fileName);
      InputStreamReader reader = new InputStreamReader(input);
      BufferedReader buff = new BufferedReader(reader);
      try {
        return buff.readLine();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

