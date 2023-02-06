package com.epam.port.entity;

public class Ship extends Thread {
  private int shipId;
  private int container;
  enum StateShip {
    LOAD, UNLOAD, LOAD_UNLOAD
  }
  private StateShip stateShip;

  public Ship(int shipId, int container, StateShip stateShip) {
    this.shipId = shipId;
    this.container = container;
    this.stateShip = stateShip;
  }

  @Override
  public void run() {
   Port port = Port.getInstance();
    Pier pier = null;
   try {
      pier = port.getPier();
   switch (stateShip) {
     case LOAD -> port.load(1);
     case UNLOAD -> port.unload(2);
     case LOAD_UNLOAD -> {
       port.unload(3);
       port.load(4);
     }
   }
   }finally {
     port.releasePier(pier);
   }
  }
}
