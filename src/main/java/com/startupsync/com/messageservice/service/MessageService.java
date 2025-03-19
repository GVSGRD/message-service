package com.startupsync.com.messageservice.service;

import com.startupsync.com.messageservice.entity.Message;
import com.startupsync.com.messageservice.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public List<Message> getMessagesByChatId(Long chatId) {
        return messageRepository.findByChatRoomId(chatId);
    }
}