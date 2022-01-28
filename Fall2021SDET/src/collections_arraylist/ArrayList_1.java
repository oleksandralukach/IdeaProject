package collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_1 {

/*
// Arraylist is a collection of objects and it implements List interface
    // and it is part of Collection interface. (Collection framework)
    // Arraylist is dynamic where we can create and manipulate it by adding or removing elements
    // from it, the size can change.

    // Arraylist stores objects, primitives by autoboxing them to their corresponding wrapper classes.

    // Arraylist elements can be accessed by their index positions.
 */

    /*
    Java 5 introduced a way of storing primitive types into ArrayList
    by providing the data type to be a wrapper class
     */

    public static void main(String[] args) {

        // old way:

        ArrayList list = new ArrayList();
        list.add(123); //obj
        list.add("123"); //obj
        list.add('k'); //obj
        list.add(Boolean.TRUE); // object of true

        System.out.println(list);

        //int a = list.get(0);
        boolean b = list.add(3);

        //=======================================
       // Array List can store Arrays as objects
        int[] nums = {1,2,3,4};
        int[] nums2 = {5,6,9,0};

        Integer[] nums3 = {8,6,4,0};

        ArrayList <int[]> numsList = new ArrayList<>();
        numsList.add(nums);
        numsList.add(nums2);

        //1)
        System.out.println(Arrays.toString(numsList.get(0)));
        //2)
        for (int[] num: numsList){
            System.out.print(Arrays.toString(num));
        }
        


    }
}
