package by.bsu2.io;

import java.io.Serializable;

public class SerialEntity implements Serializable {
  private long ide;
  static String desc = "ABC";
  private transient int count = 42;
  private int price;
  public final static long serialVersionUID = 1;

  public SerialEntity() {
  }

  public SerialEntity(long ide, int count, int price) {
    this.ide = ide;
    this.count = count;
    this.price = price;
  }

  public SerialEntity(long id) {
    this.ide = id;
  }

  public long getIde() {
    return ide;
  }

  public void setIde(long ide) {
    this.ide = ide;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("SerialEntity{");
    sb.append("id=").append(ide);
    sb.append(", count=").append(count);
    sb.append('}' + desc);
    return sb.toString();
  }
}
