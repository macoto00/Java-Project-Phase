package com.example.spring_boot_security_jwt_authentication_gradle.repository;

import com.example.spring_boot_security_jwt_authentication_gradle.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
