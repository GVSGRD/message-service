package com.startupsync.com.messageservice.controller;

import com.startupsync.com.messageservice.entity.Message;
import com.startupsync.com.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @Autowired
    private MessageService messageService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/messages")
    public Message sendMessage(Message message) {
        return messageService.saveMessage(message);
    }
}