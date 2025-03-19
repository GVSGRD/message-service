package com.startupsync.com.messageservice.repository;

import com.startupsync.com.messageservice.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
}