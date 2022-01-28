package map;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntrySetIteration {

    // Entry - interface inside interface
    // map entry - key-value pair
    // Map.entrySet() returns collection view of the map, whose elements are of this class.
    // A Map.Entry is a single key/value pair contained in the Map.
    // It's two most-used methods are getKey() and getValue()

    public static void main(String[] args) {

        Map<String, Integer> populationMap = new HashMap<>();

        populationMap.put("Japan", 111111111); // one map entry
        populationMap.put("Tanzania", 344444444); // one map entry
        populationMap.put("Egypt", 333333333);
        populationMap.put("France", 22222111);
        populationMap.put("Mexico", 555555555);

        NumberFormat formatPopulation = NumberFormat.getInstance();

        //System.out.println(formatPopulation.format(populationMap.get("Mexico"))); //comas

        // map entry - key-value pair
        // Map.entrySet() returns collection view of the map with elements of this class
        Set<Map.Entry<String, Integer>> entries = populationMap.entrySet();

        System.out.println(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " has population of " + entry.getValue());
        }


    }
}
