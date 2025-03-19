package com.startupsync.com.messageservice.controller;

import com.startupsync.com.messageservice.entity.ChatRoom;
import com.startupsync.com.messageservice.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chats")
public class ChatController {

    @Autowired
    private ChatRoomService chatRoomService;

    @GetMapping
    public ResponseEntity<List<ChatRoom>> getAllChats() {
        return ResponseEntity.ok(chatRoomService.getAllChats());
    }
}