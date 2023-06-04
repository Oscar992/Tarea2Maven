package data;

import com.poiji.bind.Poiji;
import io.qameta.allure.Step;
import model.Pokemon;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/test/java/resources/data/pokemonList.xlsx";

    @Step("Getting pokemon list")
    public static List<Pokemon> getPokemonList() {
        return Poiji.fromExcel(new File(excelPath), Pokemon.class);
    }
}
