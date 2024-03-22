package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getFrom().getFirstName());
    }

    @Override
    public String getBotUsername() {
        return "CAETBOT_BOT";
    }

    @Override
    public String getBotToken() {
        return "6221818830:AAEpSJ4tfSFiHW1nHYB4r6wmKNd-FBpwFEk";
    }
}
