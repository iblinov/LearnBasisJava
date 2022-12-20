package com.epam.learn.gift.entity;

import java.util.StringJoiner;

public class Chocolate extends Sweet{
 public enum Type{
    MILK, WHITE, DARK
  }
  private Type type;
  private boolean porous;

  public Chocolate() {
  }

  public Chocolate(int weightGram, int sugarPercent, Type type, boolean porous) {
    super(weightGram, sugarPercent);
    this.type = type;
    this.porous = porous;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public boolean isPorous() {
    return porous;
  }

  public void setPorous(boolean porous) {
    this.porous = porous;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Chocolate.class.getSimpleName() + " " + super.toString() + "[", "\n")
            .add("type=" + type)
            .add("porous=" + porous)
            .add("]")
            .toString();
  }
}
