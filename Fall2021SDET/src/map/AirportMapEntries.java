package map;

import java.util.*;

public class AirportMapEntries {
    public static void main(String[] args) {
        Map<String, String> airportCodes = new HashMap<>();

        airportCodes.put("ORD", "Chicago Airport");

        //using methods directly without creating Set
//        for (Map.Entry<String, String> entry : airportCodes.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        System.out.println(airportCodes.entrySet());

    }
}
