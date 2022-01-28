package arrays.sort_method;

import java.util.Arrays;

// sort() is void method which sorts elements in array
// sort() sorts elements in array and put it from smaller to larger
// int -> starting from smaller number
// String -> alphabetic order
// Uppercase letters take higher precedence
// Numbers have the highest precedence in sorting in a String Array
// (put before letters (when we have numbers as a String))

public class SortingInt {
    public static void main(String[] args) {
        int[] scores = {75, 78, 98, 95};
        System.out.println("Before sorting: " + Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println("After sorting: " + Arrays.toString(scores));

        //=========================================================================

        String[] schools = {"Harvard", "ASU", "Penn State", "Berkley"};
        Arrays.sort(schools);
        System.out.println(Arrays.toString(schools));
        System.out.println(schools[2]);

        //=========================================================================

        char[] names = {'%', '!', '7', ' ', 'r'}; // ASCII table
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
