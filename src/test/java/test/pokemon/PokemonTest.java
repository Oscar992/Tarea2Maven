package test.pokemon;

import base.BaseTest;
import data.DataGiver;
import data.ExcelReader;
import io.qameta.allure.Description;
import model.Pokemon;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.Logs;
import utility.Sorts;

import java.util.ArrayList;

public class PokemonTest extends BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Logs.info("setUp");
    }

    @Test(groups = {smoke, regression})
    @Description("verificarPokemon")
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

    @Test(groups = {smoke}, enabled = false)
    public void ordenarBubbleSortPokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        Sorts.bubbleSort(pokemonList);

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "“Clefairy”");
        softAssert.assertAll();
    }

    @Test(groups = {smoke}, enabled = false)
    public void ordenarBubbleSortAlfabeticamentePokemon() {
        final var pokemonList = ExcelReader.getPokemonList();

        Sorts.bubbleSortMenorMayor(pokemonList);

        softAssert.assertEquals(pokemonList.get(0).getNombre(), "Zubat");
        softAssert.assertEquals(pokemonList.get(150).getNombre(), "Abra");
        softAssert.assertAll();
    }

    @Test(groups = {regression})
    @Description("verificarPokemonNoAtrapados")
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

    @Test(
            groups = {smoke, regression},
            dataProvider = DataGiver.DP_POKEMON,
            dataProviderClass = DataGiver.class
    )
    @Description("ejercicio1")
    public void ejercicio1(Pokemon pokemon) {
        Logs.info("%s", pokemon);
        var pass = false;
        if ((pokemon.getNombre().toCharArray().length < 30 && pokemon.getNombre().toCharArray().length > 2) &&
                (pokemon.getNombreJapones().toCharArray().length < 25 && pokemon.getNombreJapones().toCharArray().length > 2) &&
                (pokemon.getAtk() > 0) &&
                (pokemon.getDef() > 0) &&
                (pokemon.getSpDef() > 0) &&
                (pokemon.getCrit() > 0) &&
                (pokemon.getPeso() > 0) &&
                (Boolean.valueOf(pokemon.getAtrapado()) instanceof Boolean)) {
            pass = true;
        }
        softAssert.assertEquals(pass, true);
        softAssert.assertAll();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Logs.info("tearDown");
    }
}
