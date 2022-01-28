package set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//TreeSet implementation stores elements in natural order (ascending).
// Alphabetic or numeric order
// still can not use indexes

public class TreeSetDemo {
    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();

        names.add("Elon");
        names.add("Marry");
        names.add("Alf");

        System.out.println(names);
    }
}
