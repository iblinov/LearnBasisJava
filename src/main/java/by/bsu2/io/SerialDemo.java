package by.bsu2.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo {
  public static void main(String[] args) {
    SerialEntity entity = new SerialEntity(777);
    try {
      ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File("data/object.ser")));
      output.writeObject(entity);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
