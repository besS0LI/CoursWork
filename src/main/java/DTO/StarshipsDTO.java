package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StarshipsDTO {
    private String name;
    private String length;
    private String manufacturer;
    private String crew;
    private String cost_in_credits;
    public String getName() {
        return name;
    }
    public String getLength() {
        return length;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getCrew() {
        return crew;
    }
    public String getCost_in_credits() {
        return cost_in_credits;
    }
    public void printStarshipsInfo() {
        System.out.println("Название: " + getName());
        System.out.println("Длинна в метрах: " + getLength());
        System.out.println("Производитель: " + getManufacturer());
        System.out.println("Колличество персонала: " + getCrew());
        System.out.println("Цена в галактических кредитах: " + getCost_in_credits());
    }
}