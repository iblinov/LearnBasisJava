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

}
