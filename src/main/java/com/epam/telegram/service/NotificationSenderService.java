package com.epam.telegram.service;

import com.epam.telegram.entity.Notification;
import com.epam.telegram.exception.NotificationException;

public interface NotificationSenderService {

    void sendMessage(Notification notification) throws NotificationException;
}
