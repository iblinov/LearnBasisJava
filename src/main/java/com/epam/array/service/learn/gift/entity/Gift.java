package com.epam.array.service.learn.gift.entity;

import java.util.List;

public class Gift {
private List<Sweet> list;

  public Gift(List<Sweet> list) {
    this.list = list;
  }

  public List<Sweet> getList() {
    return list;
  }

  public void setList(List<Sweet> list) {
    this.list = list;
  }
}
