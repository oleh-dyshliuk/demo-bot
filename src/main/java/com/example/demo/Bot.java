package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Bot extends TelegramLongPollingBot {

    public Bot(@Value("${bot.token}") final String token){
        super(token);
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

    @Override
    public String getBotUsername() {
        return "test";
    }
}
