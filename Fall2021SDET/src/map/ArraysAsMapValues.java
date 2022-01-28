package map;

import java.util.*;

public class ArraysAsMapValues {
    public static void main(String[] args) {

        // Array as value in Map
        Map<String, String[]> majorCitiesMap = new HashMap<>();

        String[] euCities = {"London", "Paris", "Rome"};
        String[] northAmCities = {"Toronto", "Mexico", "San Diego"};
        String[] asianCities = {"Beijing", "Tokyo", "Istanbul"};

        majorCitiesMap.put("EU", euCities); // or directly->("EU", new String[]{"London", "Paris"})
        majorCitiesMap.put("NA", northAmCities);
        majorCitiesMap.put("Asia", asianCities);

        System.out.println(Arrays.toString(majorCitiesMap.get("EU")));

        //==================================================================

        // List as data type of value in Map
        Map<String, List<String>> majorCitiesMap2 = new HashMap<>();

        List<String> euCities2 = Arrays.asList("London", "Paris", "Rome");
        majorCitiesMap2.put("EU", euCities2);

        System.out.println(majorCitiesMap2.get("EU"));
    }

    public static void printMajorCities(Map<String, String[]> mapOfMajorCities) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the continent: ");

        String continent = scan.nextLine().toLowerCase();
        String majorCitiesText = "There are major cities in " + continent;

        switch (continent) {
            case "eu", "europa":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("EU")));
                break;
            case "north america", "na":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("NA")));
                break;
            case "asia":
                System.out.println(majorCitiesText + Arrays.toString(mapOfMajorCities.get("Asia")));
            default:
                System.out.println("We only have cities EU, NA and Asia");
        }
    }
}
