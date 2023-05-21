package test;

import base.BaseTest;
import data.DataGiver;
import data.ExcelReader;
import org.testng.annotations.Test;
import utility.Sorts;

import java.util.ArrayList;

public class PokemonTest extends BaseTest {

    @Test
    public void verificarPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();
        final var pokemon = DataGiver.getPokemon(20);
        
        softAssert.assertTrue(pokemonList.contains(pokemon));
        softAssert.assertEquals(pokemon.getNombre(), "Raticate");
        softAssert.assertEquals(pokemon.getNombreJapones(), "Ratta");
        softAssert.assertEquals(pokemon.getAtk(), 97);
        softAssert.assertEquals(pokemon.getDef(), 9);
        softAssert.assertEquals(pokemon.getSpDef(), 4);
        softAssert.assertEquals(pokemon.getCrit(), 81);
        softAssert.assertEquals(pokemon.getPeso(), 7.28);
        softAssert.assertEquals(pokemon.getAtrapado(), true);
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
