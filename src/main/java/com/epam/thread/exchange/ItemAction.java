package com.epam.thread.exchange;

import java.util.concurrent.Exchanger;

public class ItemAction {
  private static Exchanger<Item> exchanger = new Exchanger<>();

  public void doActionPrice(Item item, float discount) {
    try {
      for (int i = 0; i < 2; i++) {
      item.setPrice(item.getPrice() * discount);
      item = exchanger.exchange(item);
    }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  public void doActionDescription(Item item, String addDescription) {
    try {
      for (int i = 0; i < 2; i++) {
        item.setDescription(item.getDescription() + addDescription);
        item = exchanger.exchange(item);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
