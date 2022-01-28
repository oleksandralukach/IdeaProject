package set;

import java.util.*;

public class ImplementationsOfSet {
    public static void main(String[] args) {

        ArrayList<String> listOfCities = new ArrayList<>(Arrays.asList("Chicago", "LA", "SF"));
        System.out.println("List " + listOfCities);

        //HashSet implementation of set interface stores
        //elements without order
        Set<String> hasSetOfCities = new HashSet<>(listOfCities);
        System.out.println("HashSet " + hasSetOfCities);

        //LinkedHashSet implementation of set interface stores
        //elements in insertion order(the order they were inserted)
        Set<String> setOfCities = new LinkedHashSet<>(listOfCities);
        System.out.println("LinkedHashSet " + setOfCities);

        //TreeSet implementation of set interface stores
        //elements in natural order (ascending)
        Set<String> treeSetOfCities = new TreeSet<>(listOfCities);
        System.out.println("LinkedHashSet " + treeSetOfCities);
    }
}
