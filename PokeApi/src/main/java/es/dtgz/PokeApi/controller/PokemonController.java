package es.dtgz.PokeApi.controller;

import es.dtgz.PokeApi.model.PokemonResponse;
import es.dtgz.PokeApi.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/pokemon/{name}")
    public PokemonResponse getPokemon(@PathVariable String name) {
        return pokemonService.getPokemon(name);
    }
}
