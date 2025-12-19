package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.UserEntity;

public interface UserService {
    UserEntity createUser(UserEntity user);

    
    List<UserEntity> getAllUsers();
}
