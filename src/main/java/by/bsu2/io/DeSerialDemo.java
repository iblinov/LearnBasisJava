package by.bsu2.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialDemo {
  public static void main(String[] args) {
   SerialEntity.desc = "XYZ";
    try {
      ObjectInputStream input = new ObjectInputStream(new FileInputStream(new File("data/object.ser")));
      SerialEntity entity = (SerialEntity)input.readObject();
      System.out.println(entity);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
