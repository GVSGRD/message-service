package com.startupsync.com.messageservice.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserChatRoomId implements Serializable {
    private int userId;
    private int chatRoomId;

    // Getters, setters, equals, and hashCode
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