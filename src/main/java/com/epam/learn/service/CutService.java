package com.epam.learn.service;

public class CutService extends BaseService {
  @Override
  public String change(String str) {
    return str.substring(3);
  } // TODO: 12/20/2022  
}
