package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmDTO {
    private String title;
    private String episode_id;
    private String director;
    private String producer;
    public String getTitle() {
        return title;
    }
    public String getEpisode_id() {
        return episode_id;
    }
    public String getDirector() {
        return director;
    }
    public String getProducer() {
        return producer;
    }
    public void printFilmInfo() {
        System.out.println("Название: " + getTitle());
        System.out.println("Номер эпизода: " + getEpisode_id());
        System.out.println("Режиссер: " + getDirector());
        System.out.println("Продюсер: " + getProducer());
    }
}