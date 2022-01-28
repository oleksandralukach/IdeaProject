package Iterator;

import java.util.*;

public class LoopingUsingIterator {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Elon");
        names.add("Bezos");
        names.add("Natasha");
        names.add("Petro");
        System.out.println(names);

        Iterator<String> it = names.iterator();
        //printing all elements of Set:

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(it.next());
//        }

        System.out.println("======================================");

        //using while loop
        // if we used all elements before (by next() method)
        // and now we can not move to next element
        // it will be empty
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        while (it.hasNext()){
            if (it.next().equals("Elon")){
                it.remove(); // removes elon
            }
        }

        System.out.println(names);

        System.out.println("=================================");

        Set<StringBuilder> names2 = new HashSet<>();
        StringBuilder name = new StringBuilder("Elon");
        names2.add(name);
        names2.add(new StringBuilder("Bezos"));
        names2.add(new StringBuilder("Natasha"));
        names2.add(new StringBuilder("Petro"));

        Iterator<StringBuilder> it2 = names2.iterator();

        while (it2.hasNext()){
            StringBuilder elon = it2.next();
            if (elon.toString().equals("Elon")){
                elon.append(" Musk");
            }
        }
        System.out.println(names2);

    }
}
