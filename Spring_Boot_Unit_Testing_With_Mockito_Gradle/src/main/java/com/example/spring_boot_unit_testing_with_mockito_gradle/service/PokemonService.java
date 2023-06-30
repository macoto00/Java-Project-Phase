package com.example.spring_boot_unit_testing_with_mockito_gradle.service;

import com.example.spring_boot_unit_testing_with_mockito_gradle.dtos.PokemonDto;
import com.example.spring_boot_unit_testing_with_mockito_gradle.dtos.PokemonResponse;

public interface PokemonService {
    PokemonDto createPokemon(PokemonDto pokemonDto);
    PokemonResponse getAllPokemon(int pageNo, int pageSize);
    PokemonDto getPokemonById(int id);
    PokemonDto updatePokemon(PokemonDto pokemonDto, int id);
    void deletePokemonId(int id);
}
