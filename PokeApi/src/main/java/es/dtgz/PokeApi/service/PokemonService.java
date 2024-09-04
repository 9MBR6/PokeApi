package es.dtgz.PokeApi.service;

import es.dtgz.PokeApi.model.PokemonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    @Autowired
    private PokeApiClient pokeApiClient;

    public PokemonResponse getPokemon(String name){
        return pokeApiClient.getPokemonByName(name);
    }
}
