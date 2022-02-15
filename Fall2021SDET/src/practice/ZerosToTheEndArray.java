package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZerosToTheEndArray {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 1, 0, 5};

        int[] arrNew = zerosToRight(arr);
        System.out.println("Method 1: " + Arrays.toString(arrNew));

        //=======================================
        int[] arrNew2 = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length-1, j = 0; i > 0; i--,j++) {
            arrNew2[j] = arr[i];
        }
        System.out.println("Method 2: " + Arrays.toString(arrNew2));

        //===========================================

        List<Integer> reverseList = new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            reverseList.add(arr[i]);
        }
        System.out.println("Method 3: "+reverseList);
    }

    public static int[] zerosToRight(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arrNew[j] = arr[i];
                j++;
            }
        }

        return arrNew;
    }

//    public static int[] zerosToRight2(int[] arr) {
//
//        //Collections.sort(arr, Collections.reverseOrder());
//        Arrays.stream(arr).boxed().sorted(Collections.reverseOrder());
//
//        return arr;
//    }
}
