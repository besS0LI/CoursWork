package Application;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RequestLibrary {
    private static final Map<String, String> PEOPLE_REQUESTS = new HashMap<>();
    private static final Map<String, String> PLANET_REQUESTS = new HashMap<>();
    private static final Map<String, String> Film_REQUESTS = new HashMap<>();
    private static final Map<String, String> Starship_REQUESTS = new HashMap<>();

    static {
        PEOPLE_REQUESTS.put("Luke Skywalker", "people/1/");
        PEOPLE_REQUESTS.put("R2-D2", "people/3/");
        PEOPLE_REQUESTS.put("Darth Vader", "people/4/");
        PEOPLE_REQUESTS.put("Obi-Wan Kenobi", "people/10/");
        PEOPLE_REQUESTS.put("Han Solo", "people/14/");

        PLANET_REQUESTS.put("Tatooine", "planets/1/");
        PLANET_REQUESTS.put("Alderaan", "planets/2/");
        PLANET_REQUESTS.put("Yavin IV", "planets/3/");
        PLANET_REQUESTS.put("Hoth", "planets/4/");
        PLANET_REQUESTS.put("Dagobah", "planets/5/");

        Film_REQUESTS.put("A New Hope", "films/1/");
        Film_REQUESTS.put("The Empire Strikes Back", "films/2/");
        Film_REQUESTS.put("Return of the Jedi", "films/3/");
        Film_REQUESTS.put("The Phantom Menace", "films/4/");
        Film_REQUESTS.put("Attack of the Clones", "films/5/");

        Starship_REQUESTS.put("CR90 corvette", "starships/2/");
        Starship_REQUESTS.put("Star Destroyer", "starships/3/");
        Starship_REQUESTS.put("Death Star", "starships/9/");
        Starship_REQUESTS.put("Millennium Falcon", "starships/10/");
        Starship_REQUESTS.put("X-wing", "starships/12/");
    }

    public static String getRequestUrl(String input) {
        String result = null;
        if (PEOPLE_REQUESTS.containsKey(input)) {
            result = PEOPLE_REQUESTS.get(input);
        } else if (PLANET_REQUESTS.containsKey(input)) {
            result = PLANET_REQUESTS.get(input);
        } else if (Film_REQUESTS.containsKey(input)) {
            result = Film_REQUESTS.get(input);
        } else if (Starship_REQUESTS.containsKey(input)) {
            result = Starship_REQUESTS.get(input);
        }
        return result;
    }

    public static void printAllKeys() {
        System.out.println("People Requests:");
        printKeys(PEOPLE_REQUESTS.keySet());

        System.out.println("\nPlanet Requests:");
        printKeys(PLANET_REQUESTS.keySet());

        System.out.println("\nFilm Requests:");
        printKeys(Film_REQUESTS.keySet());

        System.out.println("\nStarship Requests:");
        printKeys(Starship_REQUESTS.keySet());
    }

    private static void printKeys(Set<String> keys) {
        for (String key : keys) {
            System.out.println(key);
        }
    }
}