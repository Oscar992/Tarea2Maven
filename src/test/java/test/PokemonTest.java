package test;

import base.BaseTest;
import data.ExcelReader;
import model.Pokemon;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PokemonTest extends BaseTest {

    @Test
    public void verificarPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        softAssert.assertTrue(pokemonList.contains(pokemonList.get(89)));
        softAssert.assertEquals(pokemonList.get(89).getNombre(), "Raticate");
        softAssert.assertEquals(pokemonList.get(89).getNombreJapones(), "Ratta");
        softAssert.assertEquals(pokemonList.get(89).getAtk(), 97);
        softAssert.assertEquals(pokemonList.get(89).getDef(), 9);
        softAssert.assertEquals(pokemonList.get(89).getSpDef(), 4);
        softAssert.assertEquals(pokemonList.get(89).getCrit(), 81);
        softAssert.assertEquals(pokemonList.get(89).getPeso(), 7.28);
        softAssert.assertEquals(pokemonList.get(89).getAtrapado(), true);
        softAssert.assertAll();
    }

    @Test
    public void ordenarBubbleSortPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        for (var j = 0; j < pokemonList.size() - 1; j++) {
            if (pokemonList.get(j).getAtk() < pokemonList.get(j + 1).getAtk()) {
                Pokemon aux = pokemonList.get(j);
                pokemonList.add(j, pokemonList.get(j + 1));
                pokemonList.add(j + 1, aux);
            }
        }

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "“Clefairy”");
        softAssert.assertAll();
    }

    @Test
    public void ordenarBubbleSortAlfabeticamentePokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        for (var j = 0; j < pokemonList.size(); j++) {
            for (var i = j + 1; i < pokemonList.size(); i++) {
                // comparing adjacent strings
                if (pokemonList.get(i).getNombre().compareTo(pokemonList.get(j).getNombre()) > 0) {
                    Pokemon aux = pokemonList.get(j);
                    pokemonList.add(j, pokemonList.get(i));
                    pokemonList.add(i, aux);
                }
            }

        }

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "Zubat");
        softAssert.assertEquals(pokemonList.get(150).getNombre(), "Abra");
        softAssert.assertAll();
    }

    @Test
    public void verificarPokemonNoAtrapados() {
        final var pokemonList = ExcelReader.getPokemonList();
        List<Pokemon> pokemonFinalList = new ArrayList<>();
        for (var pokemon : pokemonList) {
            if (!pokemon.getAtrapado()) {
                pokemonFinalList.add(pokemon);
            }
        }
        softAssert.assertEquals(pokemonFinalList.size(), "80");
        softAssert.assertAll();
    }
}
