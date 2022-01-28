package set;

import java.util.*;

public class Set1 {

/*
    - Set is an interface that extends Collection interface
    - Set has 3 implementations: HashSet, LinkedHashSet, TreeSet
    - Collection that stores only unique elements without duplicates
    - Elements are unordered and not index based

    Set actually checks at runtime if the value
    that's being added is already in the collection
     */

    public static void main(String[] args) {

        Set<String> carMakers = new HashSet<>();

        carMakers.add("Mazda");
        carMakers.add("Cadillac");
        carMakers.add("Ford");
        boolean isAdded = carMakers.add("Honda");
        // only unique elements so only first Honda will be added
        boolean hasHonda = carMakers.add("Honda");

        System.out.println(carMakers);
        System.out.println(isAdded);
        System.out.println(hasHonda);

        System.out.println("=================================");
        List<String> cars = new ArrayList<>(carMakers);
        System.out.println(cars);

    }
}
