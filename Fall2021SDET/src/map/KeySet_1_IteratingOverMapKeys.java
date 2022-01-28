package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KeySet_1_IteratingOverMapKeys {

    public static void main(String[] args) {

        Map<Integer, String> cityCodes = new HashMap<>();
        cityCodes.put(312, "Chicago");
        cityCodes.put(313, "LA");
        cityCodes.put(314, "Seattle");
        cityCodes.put(315, "DC");
        System.out.println(cityCodes);

        // creating Set collection to store just keys using map.keySet() method
        //keySet() method in Java is used to create a set out of the key elements contained in the hash map.
        Set<Integer> keySetOfCities = cityCodes.keySet();// returns a Set view of the keys in this map
        System.out.println("The keys in the map are" + keySetOfCities);

        // iterating over all keys to access all values
        for (Integer keys: keySetOfCities){
            System.out.println(keys + " : " + cityCodes.get(keys));
        }


    }
}
