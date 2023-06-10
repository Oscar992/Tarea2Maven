package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Trabajo {
    @JsonProperty("description")
    private String description;
    @JsonProperty("hours_per_day")
    private int hoursPerDay;
    @JsonProperty("active")
    private boolean active;

    public String getDescription() {
        return description;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public boolean isActive() {
        return active;
    }
}
