package com.startupsync.com.messageservice.repository;

import com.startupsync.com.messageservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}