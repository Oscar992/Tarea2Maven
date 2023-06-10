package test.persona;

import base.BaseTest;
import data.JsonReader;
import io.qameta.allure.Description;
import model.Persona;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.Logs;

public class PersonaTest extends BaseTest {

    private final Persona persona = JsonReader.getPersona("persona");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Logs.info("SetUp");
    }

    @Test
    @Description("verificarCantidadFavoriteMealsLista")
    public void verificarCantidadFavoriteMealsLista() {
        softAssert.assertEquals(persona.getFavoriteMeals().size(), 4);
        softAssert.assertAll();
    }

    @Test
    @Description("verificarListaAmigos")
    public void verificarListaAmigos() {
        softAssert.assertEquals(persona.getAmigos().size(), 3);
        softAssert.assertAll();
    }

    @Test
    @Description("verificarAmigo")
    public void verificarAmigo() {

        final var primerAmigo = (persona.getAmigos().get(0));

        softAssert.assertEquals(primerAmigo.getName(), "Carlos");
        softAssert.assertEquals(primerAmigo.getProfession(), "Profesor");
        softAssert.assertEquals(primerAmigo.getWhereTheyMeet(), "Universidad");
        softAssert.assertAll();
    }

    @Test
    @Description("verificarTrabajoLead")
    public void verificarTrabajoLead() {

        final var trabajo = (persona.getTrabajosLista().get("lead"));

        softAssert.assertEquals(trabajo.getDescription(), "trabajo como junior luego de practicante");
        softAssert.assertEquals(trabajo.getHoursPerDay(), 8);
        softAssert.assertEquals(trabajo.isActive(), false);
        softAssert.assertAll();
    }

    @Test
    @Description("verificarPais")
    public void verificarPais() {
        softAssert.assertEquals(persona.getCountry(), "Checoslovaquia");
        softAssert.assertAll();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Logs.info("tearDown");
    }
}
