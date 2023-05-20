package test;

import base.BaseTest;
import data.ExcelReader;
import data.MapParser;
import org.testng.annotations.Test;
import utility.Sorts;

import java.util.ArrayList;

public class PokemonTest extends BaseTest {

    @Test
    public void verificarPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        softAssert.assertTrue(pokemonList.contains(MapParser.getPokemonMap().get(20)));
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getNombre(), "Raticate");
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getNombreJapones(), "Ratta");
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getAtk(), 97);
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getDef(), 9);
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getSpDef(), 4);
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getCrit(), 81);
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getPeso(), 7.28);
        softAssert.assertEquals(MapParser.getPokemonMap().get(20).getAtrapado(), true);
        softAssert.assertAll();
    }

    @Test
    public void ordenarBubbleSortPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        Sorts.bubbleSort(pokemonList);

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "“Clefairy”");
        softAssert.assertAll();
    }

    @Test
    public void ordenarBubbleSortAlfabeticamentePokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        Sorts.bubbleSortMenorMayor(pokemonList);

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "Zubat");
        softAssert.assertEquals(pokemonList.get(150).getNombre(), "Abra");
        softAssert.assertAll();
    }

    @Test
    public void verificarPokemonNoAtrapados() {
        final var pokemonList = ExcelReader.getPokemonList();
        final var pokemonFinalList = new ArrayList<>();
        for (var pokemon : pokemonList) {
            if (!pokemon.getAtrapado()) {
                pokemonFinalList.add(pokemon);
            }
        }
        softAssert.assertEquals(pokemonFinalList.size(), "80");
        softAssert.assertAll();
    }
}
