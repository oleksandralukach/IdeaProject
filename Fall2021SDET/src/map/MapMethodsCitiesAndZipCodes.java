package map;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsCitiesAndZipCodes {
    public static void main(String[] args) {

        Map<Integer, String> citiesAndZipCodes = new HashMap<>();
        citiesAndZipCodes.put(60490, "Bolingbrook");
        citiesAndZipCodes.put(96051, "Los Angeles");
        citiesAndZipCodes.put(67893, "Chicago");
        citiesAndZipCodes.put(69000, "Miami");

        System.out.println("The city associated with zip code: " + citiesAndZipCodes.get(69000));

        // remove(Object key) -> returns the value of the removed key and if the entry
        // or the key does not exist in the map then it returns null
        String removedValue = citiesAndZipCodes.remove(60490);
        System.out.println("The removed value: " + removedValue);
        System.out.println(citiesAndZipCodes);

        citiesAndZipCodes.put(60490, "Lisle");
        System.out.println("Adding new key with value:" + citiesAndZipCodes);

        // replace(Object key) -> returns the replaced value associated with this key
        String replacedValue = citiesAndZipCodes.replace(60490, "Evanston");
        System.out.println("The replaced value: " + replacedValue);
        System.out.println(citiesAndZipCodes);

        Map<Byte, String> islesMap = new HashMap<>();
        islesMap.put((byte) 2, "Pharmacy");
        islesMap.put((byte) 3, "Home Goods");
        islesMap.put((byte) 4, "Veggies");
        islesMap.put((byte) 5, "Toys");

        System.out.println(islesMap);

    }
}
