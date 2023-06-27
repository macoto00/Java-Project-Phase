package com.example.loginandregister.service;

import com.example.loginandregister.dto.UserDto;
import com.example.loginandregister.model.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
