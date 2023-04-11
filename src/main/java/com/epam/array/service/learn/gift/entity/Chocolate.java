package com.epam.array.service.learn.gift.entity;

import java.util.StringJoiner;

public class Chocolate extends Sweet {


  public enum Type{
    MILK, WHITE, DARK
  }
  private Type type;
  private boolean porous;

  public Chocolate() {
  }

  public Chocolate(int sweetId, int weightGram, int sugarPercent, Type type, boolean porous) {
    super(sweetId, weightGram, sugarPercent);
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Chocolate)) return false;
    if (!super.equals(o)) return false;

    Chocolate chocolate = (Chocolate) o;

    if (porous != chocolate.porous) return false;
    return type == chocolate.type;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (type != null ? type.hashCode() : 0);
    result = 31 * result + (porous ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Chocolate.class.getSimpleName() + super.toString() + "[", "]")
            .add("type=" + type)
            .add("porous=" + porous)
            .toString();
  }
}
