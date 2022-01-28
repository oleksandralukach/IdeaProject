package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopingOverSetElements {

    /**
     * Since Set collection is not index based and there is not order of elements
     * we cannot loop over this collection using indices [index positions]
     * <p>
     * However, one way of iterating over a set collection is by using enhanced for loop(for each loop)
     * or by using Iterator interfaces
     */

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
    public static void main(String[] args) {

        Set<Character> symbols = new HashSet<>(Arrays.asList('#', '!', '%'));

        System.out.println(symbols);

        for (char c : symbols) {
            System.out.print(c + "|");
        }
        System.out.println();

        //using iterator:

        Iterator<Character> setIterator = symbols.iterator();

        while (setIterator.hasNext()) { // returns true or false if iteration has more elements
            System.out.print(setIterator.next() + "|"); // returns next element
        }

        //=================================================

        Set<String> names = new HashSet<>();
        names.add("Ilon");
        names.add("Bezos");
        names.add("Natasha");
        names.add("Petro");
        System.out.println(names);

        // iterator method will initialize an iterator with the values the Set contains
        // initialize by collection name plus iterator() method
        Iterator<String> iterator = names.iterator();

       // names.add("Mark"); // this not gonna be included in iterator bc we initialized it before this line


        String name1 = iterator.next(); // printing element from Set in order we inputted it
        System.out.println(name1);
        System.out.println(iterator.next()); // printing element from Set
        iterator.remove();

        System.out.println(names);
    }
}
