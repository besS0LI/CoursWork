package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetDTO {
    private String name;
    private String climate;
    private String diameter;
    private String population;
    public String getName() {
        return name;
    }
    public String getClimate() {
        return climate;
    }
    public String getDiameter() {
        return diameter;
    }
    public String getPopulation() {
        return population;
    }
    public void printPlanetInfo() {
        System.out.println("Название: " + getName());
        System.out.println("Климат: " + getClimate());
        System.out.println("Диаметр: " + getDiameter());
        System.out.println("Численность населения: " + getPopulation());
    }
}