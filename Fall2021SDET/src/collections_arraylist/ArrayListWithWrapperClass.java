package collections_arraylist;

import java.util.ArrayList;

public class ArrayListWithWrapperClass {
    public static void main(String[] args) {

        ArrayList<Character> charList = new ArrayList<Character>(); // second Character within
        // diamond operator is optional

        // public static void add(char)
        // Appends the specified element to the end of this list.
        charList.add('a');
        charList.add('b');
        charList.add('c');

        System.out.println(charList);

        // public void add (index, element)
        // takes an element and inserts it at index by moving the
        // existing elements to the right
        // this operation is done basically by adding 1 to the indices of existing elements

        charList.add(1, 'k'); // inserted char 'k' into index 1
        // by moving the existing items to the right of it
        System.out.println("After inserting 'k' at index 1: " + charList);

        // if I want to get the element at index 2 then there is a get() method
        // which takes int index of the element we are trying to get

        // public E get(int index) -> Returns the element at the specified position from the list.
        System.out.println("The element at index 2 is: " + charList.get(2));

        // public int size() -> returns the number of elements in the list
        System.out.println("The size of the charList is: " + charList.size());

        // to get the last element of an arraylist
        System.out.println("The last element is: " + (charList.get(charList.size() - 1)));

        System.out.println("the first element is: " + charList.get(0));
    }
}
