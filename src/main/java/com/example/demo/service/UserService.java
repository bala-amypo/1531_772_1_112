package com.example.demo.service;

import java.util.List;
import com.example.demo.Entity.UserEntity;

public interface UserService {

    UserEntity createUser(UserEntity user);

    List<UserEntity> getAllUsers();
}
