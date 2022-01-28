package arrays;

import java.util.Arrays;
/*
 * Arrays are fixed size, once array is created size cannot be changed
 * Accessing the elements will take the same time, the first and the last element
 * can be accessed in constant time O(1)
 * Arrays are objects themselves
 * Arrays can store primitive and non primitives, can store Arrays and other types of collections
 * Syntax to create an array: dataType[] nameOfArray = new dataType[size]
 * */

public class ArraysIntro {

    public static void main(String[] args) {

        String[] names = new String[5]; //null

        names[0] = "Billy";
        names[1] = "Alex"; // length 4; indexes 0 1 2 3
        // for [2] will print out 'null'
        names[3] = "Ira";
        names[4] = "Misha";

        // will print out in a row from 1 to 5 regardless how they have written

        System.out.println(Arrays.toString(names));
        System.out.println("The name at index 2 is " + names[3]);

        String[] school = new String[]{"Stanford", "Harvard", "OSU", "Penn State"};
        // print out "OSU"
        System.out.println(school[2]);


    }
}


