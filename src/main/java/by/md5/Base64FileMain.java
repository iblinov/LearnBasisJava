package by.md5;

import java.io.IOException;

public class Base64FileMain {
  public static void main(String[] args) {
    String filename = "data/t.txt";
    Base64FileEncoder encoder = new Base64FileEncoder();
    Base64FileDecoder decoder = new Base64FileDecoder();
    try {
      String filenameEncode = encoder.fileEncode(filename);
      String filenameDecode = decoder.fileDecode(filenameEncode);
      System.out.println(filenameDecode + " it's ok");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
