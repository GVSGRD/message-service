package com.startupsync.com.messageservice.controller;

import com.startupsync.com.messageservice.entity.Message;
import com.startupsync.com.messageservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.saveMessage(message));
    }

    @GetMapping("/{chatId}/messages")
    public ResponseEntity<List<Message>> getMessagesByChatId(@PathVariable Long chatId) {
        return ResponseEntity.ok(messageService.getMessagesByChatId(chatId));
    }
}