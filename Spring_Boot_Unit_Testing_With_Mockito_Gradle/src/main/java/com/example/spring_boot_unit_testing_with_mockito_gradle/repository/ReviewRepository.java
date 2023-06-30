package com.example.spring_boot_unit_testing_with_mockito_gradle.repository;

import com.example.spring_boot_unit_testing_with_mockito_gradle.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByPokemonId(int pokemonId);
}
