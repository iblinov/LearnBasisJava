package com.epam.array.service.learn.visibility.prima;

public class Alfa {
  protected Alfa(){}
  public void action(){
    Alfa a = new Alfa();
    a.exec();
  }
  private void exec(){}
  protected void commit(){}
}
