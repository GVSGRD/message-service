package com.startupsync.com.messageservice.repository;

import com.startupsync.com.messageservice.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}