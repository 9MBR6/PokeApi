package es.dtgz.PokeApi.model;

import lombok.Data;

import java.util.Objects;

@Data
public class PokemonResponse {
    private int id;
    private String name;
    private int order;
    private int height;
    private int weight;
}
