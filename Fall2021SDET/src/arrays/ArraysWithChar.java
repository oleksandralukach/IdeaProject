package arrays;

import java.util.Arrays;

public class ArraysWithChar {

    public static void main(String[] args) {

        char[] letters = new char[]{'a', 'b', 'c', 'd'};
        // expected output: a b c d

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i] + " ");
        }

        // the default value of char is '\u0000' which comes from unicode table
        char[] chars = new char[4];
        System.out.println("\n" + Arrays.toString(chars));

        // array.length -> length is final variable which gets its value at the creation of an array
        // because the arrays are fixed size length variable has to be final

        System.out.println("The size of chars array is: " + chars.length);
    }
}
