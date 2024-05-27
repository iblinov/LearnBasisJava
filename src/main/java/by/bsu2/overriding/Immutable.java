package by.bsu2.overriding;

public class Immutable {
  private int a;
  private String str;

  public Immutable(int a, String str) {
    this.a = a;
    this.str = str;
  }

  public int getA() {
    return a;
  }

  public String getStr() {
    return str;
  }
}


