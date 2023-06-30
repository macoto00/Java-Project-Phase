package com.example.spring_boot_unit_testing_with_mockito_gradle.repository;

import com.example.spring_boot_unit_testing_with_mockito_gradle.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    Optional<Pokemon> findByType(String type);
}
