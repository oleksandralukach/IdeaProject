package coding_bat.array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given 2 int arrays, each length 2,
 * return a new array length 4 containing all their elements.
 * <p>
 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
 * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class PlusTwo {
    public static void main(String[] args) {
        int[] a = {1};
        int[] b = {5, 6, 8};
        int[] c = {7};
        System.out.println(Arrays.toString(plusTwo(a, b, c)));

    }

    public static int[] plusTwo(int[] a, int[] b, int[] c) {

        //int[] newArr = new int[4];

//        newArr[0] = a[0];
//        newArr[1] = a[1];
//        newArr[2] = b[0];
//        newArr[3] = b[1];

        //short way:
        //int[] s = {a[0],a[1],b[0],b[1]};

//===========================================

       // loop: (to add all elements from any other two

        int[] sum = new int[a.length + b.length + c.length];

        for(int i = 0; i < a.length; i++) {
            sum[i] = a[i];
        }
        for(int i = a.length, j = 0; i < b.length + a.length; i++) {
            sum[i] = b[j];
            j++;
        }
        for(int i = a.length + b.length, j = 0; i < b.length + a.length + c.length; i++) { //4, do 5
            sum[i] = c[j];
            j++;
        }
        return sum; // 1  5 6 8  7

        //return newArr;
    }
}
