package es.dtgz.PokeApi.service;

import es.dtgz.PokeApi.model.PokemonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeApiClient {

    @GetMapping("/pokemon/{name}")
    PokemonResponse getPokemonByName(@PathVariable("name") String name);

}
