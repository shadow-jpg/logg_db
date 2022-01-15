package com.example.securingweb.interfaces;

import com.example.securingweb.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Long> {
}
