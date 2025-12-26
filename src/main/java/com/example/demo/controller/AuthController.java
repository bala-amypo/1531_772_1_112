package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.UserEntity;
import com.example.demo.Service.UserService;

@RestController
public class AuthController {

    @Autowired
    private UserService userService;

    
    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity userEntity) {
        return userService.createUser(userEntity);
    }

    
    @GetMapping("/showUser")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }
}

