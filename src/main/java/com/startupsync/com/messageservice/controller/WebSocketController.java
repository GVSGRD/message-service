package com.startupsync.com.messageservice.controller;

import com.startupsync.com.messageservice.entity.Message;
import com.startupsync.com.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class WebSocketController {

    private static final Logger logger = LoggerFactory.getLogger(WebSocketController.class);

    @Autowired
    private MessageService messageService;

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Message sendMessage(Message message) {
        try {
            logger.info("Received message: {}", message);
            return messageService.saveMessage(message);
        } catch (Exception e) {
            logger.error("Error saving message: {}", e.getMessage());
            throw e; // Re-throw the exception to propagate it to the client
        }
    }
}