package data;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.qameta.allure.Step;
import model.Persona;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private final static String jsonFolder = "src/test/java/resources/data/jsons";

    @Step("getting mapper")
    private static ObjectMapper getMapper() {
        final var mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        return mapper;
    }

    @Step("getting persona")
    public static Persona getPersona(String jsonName) {
        final var jsonPath = String.format("%s/%s.json", jsonFolder, jsonName);
        final var mapper = getMapper();

        try {
            return mapper.readValue(new File(jsonPath), Persona.class);
        } catch (IOException ioException) {
            throw new RuntimeException();
        }
    }
}
