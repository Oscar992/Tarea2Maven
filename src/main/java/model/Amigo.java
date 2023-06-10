package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amigo {
    @JsonProperty("name")
    private String name;
    @JsonProperty("profession")
    private String profession;
    @JsonProperty("where_they_meet")
    private String whereTheyMeet;

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public String getWhereTheyMeet() {
        return whereTheyMeet;
    }
}
