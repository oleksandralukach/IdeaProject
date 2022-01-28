package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionOfValuesInMap {
    public static void main(String[] args) {

    /*
    values() - method returns the collection of values from the map
     */

        Map<String,Integer> carYearBuilt = new HashMap<>();

        carYearBuilt.put("Camaro", 1967);
        carYearBuilt.put("Mustang", 2007);
        carYearBuilt.put("Honda", 2019);
        carYearBuilt.put("Impala", 1999);

        // values() returns a collection view of the values contained in this Map
        Collection<Integer> yearBuilt = carYearBuilt.values();
        System.out.println(yearBuilt);

        for(Integer value : yearBuilt) //printing values
            System.out.println(value);

        // keySet() returns a set view of keys
        Set<String> cars = carYearBuilt.keySet();
        System.out.println(cars);


    }
}
