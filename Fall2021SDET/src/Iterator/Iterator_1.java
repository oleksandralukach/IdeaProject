package Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
     Since Set can not be accessed by index and can not be modified inside for each loop,
     we don't have a way to modify Set Objects except Iterator

        Iterator is an interface
        which is a collection of same objects

        Iterator is an interface which iterate over collections such as set etc.

        boolean hasNext() similar to isEmpty -> returns true if the iteration has more elements.
        Object next() -> returns next element in the collection until hasNext() return true
        void remove() -> removes current element in the collection
 */

/**
 * Use iterator when you need to remove/replace an Object in the Set
 *
 * While iterator is being used you can not modify your Set
 * Only when it reached last element
 * Or else, when hasNext() return false
 */


public class Iterator_1 {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Ilon");
        names.add("Bezos");
        names.add("Natasha");
        names.add("Petro");
        System.out.println(names);

        // iterator method will initialize an iterator with the values the Set contains
        // initialize by collection name plus iterator() method
        Iterator<String> it = names.iterator();

        //names.add("Mark"); // this not going to be included in iterator bc we initialized it before this line

        // printing element from Set in order we inputted it one in a time:
        String name1 = it.next();
        System.out.println(name1);// printing one element from Set
        // or just in "soup":
        System.out.println(it.next());
        it.remove();

        System.out.println(names);

    }
}
