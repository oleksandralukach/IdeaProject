package practice;

import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        int[] test = {1, 1, 2, 2, 3, 4, 5, 2};

        //using set:
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < test.length; i++) {
            list.add(test[i]);
        }
        System.out.println("using set: " + list);


        //using extra array
        //sort first
        Arrays.sort(test);
        int[] uniqueElements = new int[test.length];
        int j = 0;

        //looping to find matching elements and assign it to new Array
        for (int i = 0; i < uniqueElements.length - 1; i++) {
            if (test[i] != test[i + 1]) {
                uniqueElements[j++] = test[i];
            }
        }
        uniqueElements[j++] = test[test.length - 1];// add last element
        System.out.println("Array with unique values but same length as old array"
                + Arrays.toString(uniqueElements));

        int n = j; // 5 unique elements/ new length size for new array
        int[] arrNew = new int[n];
        for (int i = 0; i < n; i++) {
            arrNew[i] = uniqueElements[i];
        }
        System.out.println("using extra array: " + Arrays.toString(arrNew));

    }
}