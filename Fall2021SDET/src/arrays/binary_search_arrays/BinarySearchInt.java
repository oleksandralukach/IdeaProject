package arrays.binary_search_arrays;

import java.util.Arrays;

public class BinarySearchInt {
    // 2 params: index, item

    public static void main(String[] args) {

        int[] ids = {56, 76, 45, 56, 23};
        System.out.println();
        System.out.println("Before sorting index of 12 is: " + Arrays.binarySearch(ids, 56));
        System.out.println();
        Arrays.sort(ids);
        System.out.println("After sorting: " + Arrays.toString(ids));
    }
}
