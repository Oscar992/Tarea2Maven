package test;

import base.BaseTest;
import data.JsonReader;
import org.testng.annotations.Test;

public class PersonaTest extends BaseTest {

    @Test
    public void verificarCantidadFavoriteMealsLista() {
        var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getFavoriteMeals().size(), 4);
    }

    @Test
    public void verificarListaAmigos() {
        var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getAmigos().size(), 3);
    }

    @Test
    public void verificarAmigo() {
        var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getAmigos().get(0).getName(), "Carlos");
        softAssert.assertEquals(persona.getAmigos().get(0).getProfession(), "Profesor");
        softAssert.assertEquals(persona.getAmigos().get(0).getWhereTheyMeet(), "Universidad");
    }

    @Test
    public void verificarTrabajoLead() {
        var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").getDescription(), "trabajo como junior luego de practicante");
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").getHoursPerDay(), 8);
        softAssert.assertEquals(persona.getTrabajosLista().get("lead").isActive(), false);
    }

    @Test
    public void verificarPais() {
        var persona = JsonReader.getPersona("persona");
        softAssert.assertEquals(persona.getCountry(), "Checoslovaquia");
    }
}
