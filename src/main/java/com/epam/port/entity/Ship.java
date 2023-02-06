package com.epam.port.entity;

public class Ship extends Thread {
  private int shipId;
  private int container;
  enum State{
    LOAD, UNLOAD, LOAD_UNLOAD
  }
  private State state;

  public Ship(int shipId, int container, State state) {
    this.shipId = shipId;
    this.container = container;
    this.state = state;
  }

  @Override
  public void run() {
   Port port = Port.getInstance();
   Pier pier = port.getPier();
   switch (state) {
     case LOAD -> port.load(1);
     case UNLOAD -> port.unload(2);
     case LOAD_UNLOAD -> {
       port.unload(3);
       port.load(4);
     }
   }
  }
}
