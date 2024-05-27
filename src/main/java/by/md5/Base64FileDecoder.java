package by.md5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

public class Base64FileDecoder {
  public String fileDecode(String filenameEncode) throws IOException{
    try (FileOutputStream fos1 = new FileOutputStream(filenameEncode + ".decode")) {
      Base64.Decoder decoder = Base64.getDecoder();
      try(InputStream input = decoder.wrap(new FileInputStream(filenameEncode))){
        int bytes;
        while ((bytes = input.read()) != -1) {
          fos1.write(bytes);
        }
      }
    }
    return filenameEncode + ".decode";
  }
}
