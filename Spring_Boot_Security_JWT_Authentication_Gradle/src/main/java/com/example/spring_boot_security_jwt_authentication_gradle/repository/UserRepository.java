package com.example.spring_boot_security_jwt_authentication_gradle.repository;

import com.example.spring_boot_security_jwt_authentication_gradle.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByUsername(String username);
    Boolean existsByUsername(String username);
}
