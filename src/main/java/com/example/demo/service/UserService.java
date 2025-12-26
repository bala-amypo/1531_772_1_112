package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserEntity;

public interface UserService {

    UserEntity createUser(UserEntity user);

    List<UserEntity> getAllUsers();

    UserEntity getUserById(Long id);

    UserEntity getUserByUsername(String username);

    UserEntity getUserByEmail(String email);

    void deleteUser(Long id);
}

