package com.epam.learn.inheritance;

public class Any {
  private int number;
  private StringBuilder str;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Any any = (Any) o;

    if (number != any.number) return false;
    return str != null ? str.equals(any.str) : any.str == null;
  }

  @Override
  public int hashCode() {
    int result = number;
    result = 31 * result + (str != null ? str.hashCode() : 0);
    return result;
  }
}
