package com.epam.learn.gift.entity;

import java.util.StringJoiner;

public class Candy extends Sweet{
 public enum Type {
    LIQUIOR,
    JELLY,
    MARZIPAN
  }
  private Type type;

  public Candy() {
  }

  public Candy(int weightGram, int sugarPercent, Type type) {
    super(weightGram, sugarPercent);
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Candy.class.getSimpleName() + " " + super.toString() +  "[", "]")
            .add("type=" + type)
            .add("\n")
            .toString();
  }
}
