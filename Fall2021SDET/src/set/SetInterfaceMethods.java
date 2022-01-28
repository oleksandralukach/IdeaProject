package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceMethods {

    /**
     * size
     * boolean add(E value)
     * boolean addAll (Collection collection)
     * boolean remove(E value)
     * boolean contains(E value)
     * @param args
     */
    public static void main(String[] args) {
        Set<String> ssn = new HashSet<>();
        ssn.add("010009956");
        ssn.add("011009956");
        ssn.add("012009956");
        ssn.add("013009956");

        String mySsn = "011009956";

        System.out.println("Does ssn exist in a collection " + ssn.contains(mySsn)); //true

        boolean isRemoved = ssn.remove(mySsn);
        System.out.println("HAs my ssn was removed " + isRemoved); //true
        System.out.println("After modification " + ssn);

        ssn.clear();
        System.out.println("After removing all elements " + ssn); //[]

        System.out.println("Is Set empty " + ssn.isEmpty()); //true

        System.out.println(ssn.size()); //0
//==============================================================================================
        Set<Integer> numsUnique = new HashSet<>();
        numsUnique.add(7);
        numsUnique.add(234);
        numsUnique.add(900);

        Set<Integer> nums3 = new HashSet<>();
        nums3.add(243);
        nums3.add(80);
        nums3.add(415);
        nums3.addAll(numsUnique);// addAll is adding on top of what Set already has

        System.out.println(numsUnique.addAll(nums3)); //true bc adding new elements, false if no new elements
    }
}
