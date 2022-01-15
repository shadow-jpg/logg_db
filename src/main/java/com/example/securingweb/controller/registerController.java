package com.example.securingweb.controller;


import com.example.securingweb.interfaces.UserRepository;
import com.example.securingweb.model.Role;
import com.example.securingweb.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class registerController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @PostMapping("/register")
        public String addUser(User user){
        User userDb = userRepository.findByName(user.getName());
                if(userDb !=null){
                    return "register";
                }
                user.setActive(true);
                user.setRole(Collections.singleton(Role.USER)); //изменить при добавлении ролей collections singleton
                userRepository.save(user);
        return "redirect:/chat";
    }
}
