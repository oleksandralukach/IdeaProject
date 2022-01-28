package collections_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ConvertingArrayListToArray {
    public static void main(String[] args) {

        List <Integer> nums = new ArrayList<>();
        nums.add(123);
        nums.add(3);
        nums.add(12);

        System.out.println(nums);

        //convert List to Array:
        //the size of an array in params is ignored if the size of an array is smaller than size of an ArrayList
        //default size is zero
        Integer[] numsArray = nums.toArray(new Integer[0]);

        System.out.println(numsArray[1]);
        //get(int index) for ArrayList -> same as arr[] for Array
        System.out.println(nums.get(1));

        //===============================================================

        ArrayList<String> colors = new ArrayList<>() {
            {
                add("Red");
                add("Blue");
                add("Yellow");
                add("Green");
            }
        };

        // we have converted all the String elements of colors list to an array of Object type
        Object[] colorsArray = colors.toArray(new Object[0]);

        System.out.println("Length of colors array: " + colorsArray.length);

        for (Object color : colorsArray) {
            System.out.println(color);
        }

        // since colorsArray is of Object[] type we need to narrow cast the type to String
        // because Object is a parent of all classes in Java
        String colorBlue = (String) colorsArray[1];

        // toArray() method requires us to provide the type of elements we are trying to store
        // by passing the type as a parameter and the array size can be initialized to
        // the size of list or 0. But if it's bigger than the size of the list then it will fill the rest with
        // null values
//        String[] colorsStrArray = colors.toArray(new String[colors.size()]);
        String[] colorsStrArray = colors.toArray(new String[0]);

        System.out.println(Arrays.toString(colorsStrArray));
    }
}
