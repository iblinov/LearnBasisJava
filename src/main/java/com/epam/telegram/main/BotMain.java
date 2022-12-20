package com.epam.telegram.main;

import com.epam.telegram.entity.Notification;
import com.epam.telegram.exception.NotificationException;
import com.epam.telegram.service.NotificationSenderService;
import com.epam.telegram.service.impl.TelegramNotificationSenderService;

public class BotMain {
  public static void main(String[] args) {
    Notification notification = new Notification.Builder()
            .setNotificationId(1)
            .setName("Курс по зельеварению")
            .setAuthor("Северус Снейп")
            .setComplexity(4)
            .setAllowableAttempts(3)
            .setDescription("Крутой курс, чего вы")
            .build();
    NotificationSenderService service = new TelegramNotificationSenderService();
    try {
      service.sendMessage(notification);
    } catch (NotificationException e) {
      e.printStackTrace();
    }
  }
}
