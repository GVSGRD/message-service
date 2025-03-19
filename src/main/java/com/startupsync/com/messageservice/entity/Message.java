package com.startupsync.com.messageservice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private Long senderId; // Sender's user ID
    private Long chatRoomId; // Associated chat room ID

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
}
