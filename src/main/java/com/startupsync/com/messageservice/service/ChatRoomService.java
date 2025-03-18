package com.startupsync.com.messageservice.service;

import com.startupsync.com.messageservice.entity.ChatRoom;
import com.startupsync.com.messageservice.repository.ChatRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ChatRoomService {

    private static final Logger logger = LoggerFactory.getLogger(ChatRoomService.class);

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public ChatRoom createChatRoom(ChatRoom chatRoom) {
        try {
            logger.info("Creating chat room: {}", chatRoom);
            return chatRoomRepository.save(chatRoom);
        } catch (Exception e) {
            logger.error("Error creating chat room: {}", e.getMessage());
            throw e; // Re-throw the exception to propagate it to the controller
        }
    }
}