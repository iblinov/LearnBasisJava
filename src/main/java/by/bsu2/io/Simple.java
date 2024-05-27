package by.bsu2.io;

import java.io.Serializable;

public class Simple implements Serializable {
  private int z = 5;

  public Simple() {
  }

  public Simple(int z) {
    this.z = z;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Simple{");
    sb.append("z=").append(z);
    sb.append('}');
    return sb.toString();
  }
}
