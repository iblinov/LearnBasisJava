package com.epam.thread.port;

public class Berth {
  private int berthId;

  public Berth(int berthId) {
    this.berthId = berthId;
  }

  public int getBerthId() {
    return berthId;
  }

  public void setBerthId(int berthId) {
    this.berthId = berthId;
  }
}
