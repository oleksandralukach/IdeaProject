package arrays;

import java.util.Arrays;

public class ArraysWithBool {

    public static void main(String[] args) {
        boolean[] boolArr = {1 < 2, false, true, true, "false" != "false"};
        // arrays can store the same data type elements even if the
        // element does not have boolean value but the outcome of the operation
        // is boolean, then it's fine

        System.out.println(Arrays.toString(boolArr));
        System.out.println(boolArr[0]);
        System.out.println(boolArr[boolArr.length-1]);

        boolean[] boolArr1 = new boolean[2]; // created an array of boolean data type with size 2
        boolArr1[0] = true; // we are assigning "true" to first index
        boolArr1[1] = isBigger(2, 4); // we are assigning the outcome of the isBigger method
        // as long as the outcome or the return type of the method matches the data type of the array
        // then it's fine.

        System.out.println("The boolArr1 values: " + Arrays.toString(boolArr1));

        // the default value of boolean type is "false"
        boolean [] emptyBool = new boolean[3];

        System.out.println(Arrays.toString(emptyBool));
    }

    static boolean isBigger(int x, int y) {

        boolean isBigger = x > y;

        return isBigger;
    }
}
