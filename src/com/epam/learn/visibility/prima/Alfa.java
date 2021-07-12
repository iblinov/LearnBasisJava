package com.epam.learn.visibility.prima;

public class Alfa {
  protected Alfa(){}
  public void action(){
    Alfa a = new Alfa();
    a.exec();
  }
  private void exec(){}
  protected void commit(){}
}
