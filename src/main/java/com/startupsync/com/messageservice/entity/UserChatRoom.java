package com.startupsync.com.messageservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_chat_room")
@IdClass(UserChatRoomId.class)
public class UserChatRoom {
    @Id
    @Column(name = "user_id")
    private int userId;

    @Id
    @Column(name = "chat_room_id")
    private int chatRoomId;
}