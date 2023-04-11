package com.epam.array.service.learn.gift2.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {
  private long orderId;
  private long clientId;
  private List<SweetType> sweets = new ArrayList<>();
  private Package pack;
  private LocalDateTime localDateTime = LocalDateTime.now();
  private boolean presentGreetingCard = true;
  public Order(long orderId, long clientId, Package pack) {
    this.orderId = orderId;
    this.clientId = clientId;
    this.pack = pack;
  }

  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }

  public long getClientId() {
    return clientId;
  }

  public void setClientId(long clientId) {
    this.clientId = clientId;
  }

  public List<SweetType> getSweets() {
    return sweets;
  }

  public void setSweets(List<SweetType> sweets) {
    this.sweets = sweets;
  }

  public Package getPack() {
    return pack;
  }

  public void setPack(Package pack) {
    this.pack = pack;
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

  public void setLocalDateTime(LocalDateTime localDateTime) {
    this.localDateTime = localDateTime;
  }

  public boolean isPresentGreetingCard() {
    return presentGreetingCard;
  }

  public void setPresentGreetingCard(boolean presentGreetingCard) {
    this.presentGreetingCard = presentGreetingCard;
  }


  @Override
  public String toString() {
    return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
            .add("orderId=" + orderId)
            .add("clientId=" + clientId)
            .add("sweets=" + sweets)
            .add("pack=" + pack)
            .add("localDateTime=" + localDateTime)
            .add("presentGreetingCard=" + presentGreetingCard)
            .toString();
  }
}
