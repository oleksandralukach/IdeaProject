package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLoops {
    // Iterating over a map using collection views
    // keySet()
    public static void main(String[] args) {
        Map<Integer, String> citiesAndZipCodes = new HashMap<>();
        citiesAndZipCodes.put(100, "San Diego");
        citiesAndZipCodes.put(200, "Los Angeles");
        citiesAndZipCodes.put(300, "San Sebastian");
        citiesAndZipCodes.put(400, "Miami");
        citiesAndZipCodes.put(500, null);
        System.out.println(citiesAndZipCodes);

        Set<Integer> allKeys = citiesAndZipCodes.keySet();

        //print all the keys
        for (Integer key : allKeys) {
            System.out.println(key);
        }

        //print all the values by providing key
        for (Integer key : allKeys) {
            System.out.println(citiesAndZipCodes.get(key));
        }
        System.out.println("===================================================");

        // check if there is null values
        // update the null values to "I'm not null anymore"
        // == not .equals (bc comparing values and null is empty value)
        for (Integer key : allKeys) {
            citiesAndZipCodes.putIfAbsent(key, "Im not null anymore");

//          if(citiesAndZipCodes.get(key) == null){
//              citiesAndZipCodes.put(key,"I'm not null anymore");

            System.out.println(citiesAndZipCodes.get(key));
        }

        System.out.println("===================================================");

        //this is not a common practice
        //since we don't have a track of the key
        // we cannot update the value for the key.
        // used only when we want print out values
        Collection<String> allOfTheValues = citiesAndZipCodes.values();
        for(String value : allOfTheValues){
            System.out.println(value);
        }
    }



}

