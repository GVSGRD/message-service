package com.startupsync.com.messageservice.repository;

import com.startupsync.com.messageservice.entity.UserChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserChatRoomRepository extends JpaRepository<UserChatRoom, Long> {
}