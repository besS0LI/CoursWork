package Application;

import DTO.FilmDTO;
import DTO.PeopleDTO;
import DTO.PlanetDTO;
import DTO.StarshipsDTO;
import Service.StarWarsApiService;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.Scanner;
import static Application.RequestLibrary.printAllKeys;

public class StarWarsApp {
    public static void main(String[] args) throws JsonProcessingException {
        boolean key = true;
        while(key) {
            System.out.print("\n1. Сделать запрос.\n2. Посмотреть библиотеку доступных запросов.\n3. Выход.\nВыберите опцию: ");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    StarWarsApiService starWarsApiService = new StarWarsApiService();
                    System.out.print("\nВведите запрос: ");
                    String userInput = scanner.nextLine().trim();
                    String requestUrl = RequestLibrary.getRequestUrl(userInput);
                    if (requestUrl != null) {
                        switch (requestUrl.split("/")[0]) {
                            case "people":
                                PeopleDTO peopleDTO = starWarsApiService.getCharacterInfo(requestUrl);
                                peopleDTO.printCharacterInfo();
                                break;
                            case "planets":
                                PlanetDTO planetDTO = starWarsApiService.getPlanetInfo(requestUrl);
                                planetDTO.printPlanetInfo();
                                break;
                            case "films":
                                FilmDTO filmDTO = starWarsApiService.getFilmInfo(requestUrl);
                                filmDTO.printFilmInfo();
                                break;
                            case "starships":
                                StarshipsDTO starshipsDTO = starWarsApiService.getStarshipsInfo(requestUrl);
                                starshipsDTO.printStarshipsInfo();
                                break;
                            default:
                                System.out.println("Неверный запрос");
                                break;
                        }
                    } else {
                        System.out.println("Неверный запрос");
                    }
                    break;
                case "2":
                    printAllKeys();
                    break;
                case "3" :
                    key = false;
                    break;
            }
        }
    }
}