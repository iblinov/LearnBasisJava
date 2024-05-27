package by.immutable;

public final class Squad {
  private final StringBuilder name;
  private final int number;
  static int a;

  public Squad(StringBuilder name, int number) {
    StringBuilder copy = new StringBuilder(name.toString());
    this.name = copy;
    this.number = number;
  }

  public StringBuilder getName() {

    return name;
  }

  public int getNumber() {
    return number;
  }

}
