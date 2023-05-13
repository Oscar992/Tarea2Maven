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
        var pokemonList = ExcelReader.getPokemonList();
        Pokemon pokemonTest = null;
        for (var pokemon : pokemonList) {
            if (pokemon.getId() == 20) {
                pokemonTest = pokemon;
                break;
            }
        }

        softAssert.assertEquals(pokemonTest.getNombre(), "Raticate");
        softAssert.assertEquals(pokemonTest.getNombreJapones(), "Ratta");
        softAssert.assertEquals(pokemonTest.getAtk(), 97);
        softAssert.assertEquals(pokemonTest.getDef(), 9);
        softAssert.assertEquals(pokemonTest.getSpDef(), 4);
        softAssert.assertEquals(pokemonTest.getCrit(), 81);
        softAssert.assertEquals(pokemonTest.getPeso(), 7.28);
        softAssert.assertEquals(pokemonTest.getAtrapado(), true);

    }

    @Test
    public void ordenarBubbleSortPokemon() {
        var pokemonList = ExcelReader.getPokemonList();

        for (var j = 0; j < pokemonList.size() - 1; j++) {
            if (pokemonList.get(j).getAtk() < pokemonList.get(j + 1).getAtk()) {
                Pokemon aux = pokemonList.get(j);
                pokemonList.add(j, pokemonList.get(j + 1));
                pokemonList.add(j + 1, aux);
            }
        }

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "“Clefairy”");
    }

    @Test
    public void ordenarBubbleSortAlfabeticamentePokemon() {
        var pokemonList = ExcelReader.getPokemonList();

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
    }

    @Test
    public void verificarPokemonNoAtrapados() {
        var pokemonList = ExcelReader.getPokemonList();
        List<Pokemon> pokemonFinalList = new ArrayList<>();
        for (var pokemon : pokemonList) {
            if (!pokemon.getAtrapado()) {
                pokemonFinalList.add(pokemon);
            }
        }
        softAssert.assertEquals(pokemonFinalList.size(), "80");
    }
}
