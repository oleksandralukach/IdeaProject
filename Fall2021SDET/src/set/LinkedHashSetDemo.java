package set;

import java.util.LinkedHashSet;
import java.util.Set;

// LinkedHashSet -> ordered collection of unique elements (Insertion order)
// still can not use indexes
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();

        names.add("Elon");
        names.add("Marry");
        names.add("Alf");

        System.out.println(names);

    }
}
