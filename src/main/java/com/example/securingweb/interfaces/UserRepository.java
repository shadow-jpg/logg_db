package com.example.securingweb.interfaces;

import com.example.securingweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String username);
}
