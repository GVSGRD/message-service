package com.startupsync.com.messageservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserChatRoomId implements Serializable {
    private int userId;
    private int chatRoomId;

    // Default constructor
    public UserChatRoomId() {}

    // Parameterized constructor
    public UserChatRoomId(int userId, int chatRoomId) {
        this.userId = userId;
        this.chatRoomId = chatRoomId;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(int chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserChatRoomId that = (UserChatRoomId) o;
        return userId == that.userId && chatRoomId == that.chatRoomId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, chatRoomId);
    }
}