package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import javax.ws.rs.client.Client;

public class MyBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
    //    System.out.println(update.getMessage().getText());
    //    System.out.println(update.getMessage().getFrom().getFirstName());

        String command = update.getMessage().getText();

        if (command.equals("/run")){
            String clientName = update.getMessage().getFrom().getFirstName();
            String message = "Olá, " + clientName + "!" + "\nEscolha uma opção de horários abaixo:";

    //        String freeHours = horários livres da integração
            SendMessage response = new SendMessage();
            response.setChatId(update.getMessage().getChatId().toString());
            response.setText(message);

            try {
                execute(response);
            } catch (TelegramApiException e){
                e.printStackTrace();
            }
        }
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
