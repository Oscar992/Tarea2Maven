package test;

import base.BaseTest;
import data.JsonReader;
import model.Persona;
import org.testng.annotations.Test;

public class PersonaTest extends BaseTest {

    private final Persona persona = JsonReader.getPersona("persona");

    @Test
    public void verificarCantidadFavoriteMealsLista() {
        softAssert.assertEquals(persona.getFavoriteMeals().size(), 4);
        softAssert.assertAll();
    }

    @Test
    public void verificarListaAmigos() {
        softAssert.assertEquals(persona.getAmigos().size(), 3);
        softAssert.assertAll();
    }

    @Test
    public void verificarAmigo() {

        final var primerAmigo = (persona.getAmigos().get(0));

        softAssert.assertEquals(primerAmigo.getName(), "Carlos");
        softAssert.assertEquals(primerAmigo.getProfession(), "Profesor");
        softAssert.assertEquals(primerAmigo.getWhereTheyMeet(), "Universidad");
        softAssert.assertAll();
    }

    @Test
    public void verificarTrabajoLead() {

        final var trabajo = (persona.getTrabajosLista().get("lead"));

        softAssert.assertEquals(trabajo.getDescription(), "trabajo como junior luego de practicante");
        softAssert.assertEquals(trabajo.getHoursPerDay(), 8);
        softAssert.assertEquals(trabajo.isActive(), false);
        softAssert.assertAll();
    }

    @Test
    public void verificarPais() {
        softAssert.assertEquals(persona.getCountry(), "Checoslovaquia");
        softAssert.assertAll();
    }
}
