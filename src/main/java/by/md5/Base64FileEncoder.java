package by.md5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;

public class Base64FileEncoder {
  public String fileEncode(String filename) throws IOException {
    try (FileInputStream input = new FileInputStream(filename)) {
      Base64.Encoder encoder = Base64.getEncoder();
      try (OutputStream output = encoder.wrap(new FileOutputStream(filename + ".encode"))) {
        int bytes;
        while ((bytes = input.read()) != -1) {
          output.write(bytes);
        }
      }
    }
    return filename + ".encode";
  }
}
