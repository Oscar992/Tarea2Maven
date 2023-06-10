package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;
import java.util.Map;

@JsonRootName("person")
public class Persona {

    @JsonProperty("name")
    private String name;
    @JsonProperty("lastname")
    private String lastName;
    @JsonProperty("weight")
    private double weight;
    @JsonProperty("numCertificates")
    private int numCertificates;
    @JsonProperty("country")
    private String country;
    @JsonProperty("married")
    private boolean married;
    @JsonProperty("favoriteMeals")
    private List<String> favoriteMeals;

    @JsonProperty("amigos")
    private List<Amigo> amigosLista;

    @JsonProperty("trabajos")
    private Map<String, Trabajo> trabajosLista;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumCertificates() {
        return numCertificates;
    }

    public String getCountry() {
        return country;
    }

    public List<Amigo> getAmigos() {
        return amigosLista;
    }

    public boolean isMarried() {
        return married;
    }

    public List<String> getFavoriteMeals() {
        return favoriteMeals;
    }

    public Map<String, Trabajo> getTrabajosLista() {
        return trabajosLista;
    }

}
