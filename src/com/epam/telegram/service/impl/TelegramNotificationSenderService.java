package com.epam.telegram.service.impl;

import com.epam.telegram.connection.TelegramURLConnectionFactory;
import com.epam.telegram.entity.Notification;
import com.epam.telegram.exception.NotificationException;
import com.epam.telegram.service.NotificationSenderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URLConnection;

public class TelegramNotificationSenderService implements NotificationSenderService {

    private static Logger logger = LogManager.getLogger(TelegramNotificationSenderService.class);

    @Override
    public void sendMessage(Notification notification) throws NotificationException {
        int attempt = 1;
        while (notification.getAllowableAttempts() > attempt && !notification.isSend()) {
            try {
                send(notification);
            } catch (NotificationException e) {
                logger.error("Error while sending telegram message. {} attempt. Trying to resend...", attempt);
                attempt++;
            }
        }
        if (notification.isSend()) {
            logger.info("Telegram notification {} was send", notification);
        } else {
           logger.error("Error while sending telegram message. {} attempt ended", attempt);
            throw new NotificationException("Error while sending telegram message");
        }
    }

    private void send(Notification notification) throws NotificationException {
        try {
            URLConnection connection = TelegramURLConnectionFactory.createConnection(notification.toString());
            StringBuilder sb = new StringBuilder();
            InputStream is = new BufferedInputStream(connection.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                sb.append(inputLine);
            }
            String response = sb.toString();
            notification.setSend(true);
            logger.info("Notification to telegram was send. Telegram answer is {}", response);
        } catch (IOException e) {
            logger.error("IOException in send telegram message: {}", e.getMessage());
            throw new NotificationException("Exception in send telegram message", e);
        }
    }

}
