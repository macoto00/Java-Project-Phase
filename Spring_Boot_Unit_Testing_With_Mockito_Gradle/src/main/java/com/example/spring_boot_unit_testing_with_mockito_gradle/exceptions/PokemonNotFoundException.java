package com.example.spring_boot_unit_testing_with_mockito_gradle.exceptions;

public class PokemonNotFoundException extends RuntimeException {
    private static final long serialVerisionUID = 1;

    public PokemonNotFoundException(String message) {
        super(message);
    }
}
