package data;

import io.qameta.allure.Step;
import model.Pokemon;
import org.testng.annotations.DataProvider;

public class DataGiver {

    public static final String DP_POKEMON = "Data Provider Pokemon";

    @Step("getPokemon")
    public static Pokemon getPokemon(int id) {
        final var map = MapParser.getPokemonMap();
        return map.get(id);
    }


    @DataProvider(name = DP_POKEMON)
    @Step("pokemon data provider")
    public Object[][] pokemonDataProvider() {
        final var pokemonLista = ExcelReader.getPokemonList();
        final var object = new Object[pokemonLista.size()][];

        for (var i = 0; i < pokemonLista.size(); i++) {
            final var currentPokemon = pokemonLista.get(i);
            object[i] = new Object[]{
                    currentPokemon
            };
        }
        return object;
    }
}
