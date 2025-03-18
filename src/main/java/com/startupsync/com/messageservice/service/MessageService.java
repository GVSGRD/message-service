package com.startupsync.com.messageservice.service;

import com.startupsync.com.messageservice.entity.Message;
import com.startupsync.com.messageservice.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class MessageService {

    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        try {
            logger.info("Saving message: {}", message);
            return messageRepository.save(message);
        } catch (Exception e) {
            logger.error("Error saving message: {}", e.getMessage());
            throw e; // Re-throw the exception to propagate it to the controller
        }
    }
}