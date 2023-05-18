package test;

import base.BaseTest;
import data.JsonReader;
import org.testng.annotations.Test;

public class PersonaTest extends BaseTest {

    @Test
    public void verificarCantidadFavoriteMealsLista() {
        final var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getFavoriteMeals().size(), 4);
        softAssert.assertAll();
    }

    @Test
    public void verificarListaAmigos() {
        final var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getAmigos().size(), 3);
        softAssert.assertAll();
    }

    @Test
    public void verificarAmigo() {
        final var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getAmigos().get(0).getName(), "Carlos");
        softAssert.assertEquals(persona.getAmigos().get(0).getProfession(), "Profesor");
        softAssert.assertEquals(persona.getAmigos().get(0).getWhereTheyMeet(), "Universidad");
        softAssert.assertAll();
    }

    @Test
    public void verificarTrabajoLead() {
        final var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").getDescription(), "trabajo como junior luego de practicante");
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").getHoursPerDay(), 8);
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").isActive(), false);
        softAssert.assertAll();
    }

    @Test
    public void verificarPais() {
        final var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getCountry(), "Checoslovaquia");
        softAssert.assertAll();
    }
}
