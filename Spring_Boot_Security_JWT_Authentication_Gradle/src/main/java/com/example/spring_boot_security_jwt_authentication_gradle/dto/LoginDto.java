package com.example.spring_boot_security_jwt_authentication_gradle.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}
