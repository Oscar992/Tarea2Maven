package data;

import io.qameta.allure.Step;
import model.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class MapParser {

    @Step("Getting pokemon map")
    public static Map<Integer, Pokemon> getPokemonMap() {
        final var userList = ExcelReader.getPokemonList();
        final var map = new HashMap<Integer, Pokemon>();

        for (var element : userList) {
            map.put(element.getId(), element);
        }
        return map;
    }
}
