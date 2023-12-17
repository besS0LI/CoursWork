package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PeopleDTO {
    private String name;
    private String height;
    private String mass;
    private String birth_year;
    private String gender;
    private String hair_color;

    public String getName() {
        return name;
    }
    public String getHeight() {
        return height;
    }
    public String getMass() {
        return mass;
    }
    public String getGender() {
        return gender;
    }
    public String getBirth_year() {
        return birth_year;
    }
    public String getHair_color() {
        return hair_color;
    }
    public void printCharacterInfo() {
        System.out.println("Имя: " + getName());
        System.out.println("Пол: " + getGender());
        System.out.println("Рост: " + getHeight());
        System.out.println("Вес: " + getMass());
        System.out.println("Год рождения: " + getBirth_year());
        System.out.println("Цвет волос: " + getHair_color());
    }
}