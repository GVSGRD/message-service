package com.startupsync.com.messageservice.service;

import com.startupsync.com.messageservice.entity.ChatRoom;
import com.startupsync.com.messageservice.repository.ChatRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRoomService {

    @Autowired
    private ChatRoomRepository chatRoomRepository;

    public List<ChatRoom> getAllChats() {
        return chatRoomRepository.findAll();
    }
}