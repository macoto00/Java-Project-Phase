package com.example.loginandregistration.service;

import com.example.loginandregistration.dto.UserDto;
import com.example.loginandregistration.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
