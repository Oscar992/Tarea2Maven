package data;

import model.Pokemon;

public class DataGiver {

    public static Pokemon getPokemon(int id) {
        final var map = MapParser.getPokemonMap();
        return map.get(id);
    }
}
