package Service;

import DTO.FilmDTO;
import DTO.PeopleDTO;
import DTO.PlanetDTO;
import DTO.StarshipsDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
public class StarWarsApiService {
    private static final String BASE_URL = "https://swapi.dev/api/";
    public PeopleDTO getCharacterInfo(String endpoint) throws JsonProcessingException {
        Response response = RestAssured.get(BASE_URL + endpoint);
        String responseBody = response.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, PeopleDTO.class);
    }
    public PlanetDTO getPlanetInfo(String endpoint) throws JsonProcessingException {
        Response response = RestAssured.get(BASE_URL + endpoint);
        String responseBody = response.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, PlanetDTO.class);
    }
    public FilmDTO getFilmInfo(String endpoint) throws JsonProcessingException {
        Response response = RestAssured.get(BASE_URL + endpoint);
        String responseBody = response.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, FilmDTO.class);
    }
    public StarshipsDTO getStarshipsInfo(String endpoint) throws JsonProcessingException {
        Response response = RestAssured.get(BASE_URL + endpoint);
        String responseBody = response.getBody().asString();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseBody, StarshipsDTO.class);
    }
}