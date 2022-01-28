package set;

import java.util.HashSet;
import java.util.Set;

public class IterateThroughSets {
    public static void main(String[] args) {
        //How we can modify specific element in Set as we don't use indexes?

        Set<String> ssn = new HashSet<>();
        ssn.add("988-23-4567");
        ssn.add("238-73-2213");

        if (ssn.contains("988-23-4567")) {
            ssn.remove("988-23-4567");
            ssn.add("988-23-4570");
        }

        //Foreach loop cannot be used to modify the collection.
        // You can only use it to play with elements

//        for (String element : ssn) {
//            if (element.equals("988-23-4567")) {
//                ssn.remove("988-23-4567");
//                ssn.add("988-23-4570");
//            }
//        }

    }
}


