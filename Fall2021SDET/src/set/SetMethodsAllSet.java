package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMethodsAllSet {
    public static void main(String[] args) {
        Set<Integer> n1 = new HashSet<>(Arrays.asList(20,25,67,8));
        Set<Integer> n2 = new HashSet<>(Arrays.asList(8, 20));

        // containsAll() returns true if n2 is a subset of n1 (n1 contains all the elements in n2)

        if(n1.containsAll(n2)){
            System.out.println("n2 is a subset of n1");
        }

        //==========================================================================================

        // addAll() transforms n1 into the union of n1 and n2 (all of the elements in either set)
        n2.add(3);
        n1.addAll(n2);
        System.out.println("n1 after union: " + n1);

        //======================================================================================================

        // retainAll() transforms n1 into the intersection of n1 and n2 (Common elements to both sets)
        n1.retainAll(n2);
        System.out.println("n1 after intersection: " + n1);

        //======================================================================================================

        // removeAll() transforms n1 into the asymmetric set difference of n1 and n2
        // (n1 minus n2 -> elements found in n1 but not in n2)
        n1.removeAll(n2);
        System.out.println("n1 after difference: " + n1);

        //Year1-> Subject taken
        //Year2-> Subject taken
        // find out which subject taken in both years

        //traveler 1-> cities traveled
        //traveler 2-> cities traveled
        // find out common cities traveled to

    }
}
