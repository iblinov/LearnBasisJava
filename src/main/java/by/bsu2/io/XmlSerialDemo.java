package by.bsu2.io;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XmlSerialDemo {
  public static void main(String[] args) {
    SerialEntity entity = new SerialEntity(54, 76, 888);
    Simple ob = new Simple(77);
    XMLEncoder decoder = null;
    try {
       decoder = new XMLEncoder(new FileOutputStream("data/ob.xml"));
      decoder.writeObject(entity);
      decoder.flush();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      decoder.close();
    }
  }
}
