package Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * we have to use iterator if we need to remove multiply elements from our Set based on some condition
 */

public class IteratorVsForEach {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Natasha");
        names.add("Petro");
        names.add("Ashley");
        names.add("Joe");
        names.add("Jane");
        System.out.println(names);


        // can not call remove inside for each loop
        // so we need to use iterator
//        for (String name : names) {
//            if (name.equals("Bezos")) {
//                names.remove("Bezos");
//            }
//        }

        /**
         * remove elements with "e" at the end:
         */

        //can not be called bc can not modify inside for each loop
//        for(String name: names){
//            if (name.endsWith("e")){
//                names.remove(name);
//            }
//        }

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            if (it.next().endsWith("e")) {
                it.remove();
            }
        }

        System.out.println(names);// removed Jane and Joe
    }
}
