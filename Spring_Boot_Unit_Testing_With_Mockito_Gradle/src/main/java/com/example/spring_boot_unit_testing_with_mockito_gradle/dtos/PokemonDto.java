package com.example.spring_boot_unit_testing_with_mockito_gradle.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDto {
    private int id;
    private String name;
    private String type;
}