package data;

import model.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class MapParser {
    public static Map<Integer, Pokemon> getPokemonMap() {
        final var userList = ExcelReader.getPokemonList();
        final var map = new HashMap<Integer, Pokemon>();

        for (var element : userList) {
            map.put(element.getId(), element);
        }
        return map;
    }
}
