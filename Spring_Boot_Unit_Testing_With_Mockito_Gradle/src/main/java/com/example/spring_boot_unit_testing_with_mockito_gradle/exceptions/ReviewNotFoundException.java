package com.example.spring_boot_unit_testing_with_mockito_gradle.exceptions;

public class ReviewNotFoundException extends RuntimeException {
    private static final long serialVerisionUID = 2;
    public ReviewNotFoundException(String message) {
        super(message);
    }
}
