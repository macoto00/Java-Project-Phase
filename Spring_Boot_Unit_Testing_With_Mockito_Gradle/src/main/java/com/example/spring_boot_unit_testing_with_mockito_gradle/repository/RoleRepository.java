package com.example.spring_boot_unit_testing_with_mockito_gradle.repository;

import com.example.spring_boot_unit_testing_with_mockito_gradle.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
