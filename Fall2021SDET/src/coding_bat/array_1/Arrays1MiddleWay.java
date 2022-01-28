package coding_bat.array_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays1MiddleWay {
    /*
    Given 2 int arrays, a and b, each length 3,
    return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    public static int[] middleWay(int[] a, int[] b) {

        int[] newArr = new int[2];

        int middleElementA = a[a.length/2];
        int middleElementB = b[b.length/2];

        newArr[0] = middleElementA;
        newArr[1] = middleElementB;
        System.out.println(Arrays.toString(newArr));

        return newArr;
    }

    public static void main(String[] args) {

        int[] a= new int[] {1, 2, 3};
        int[] b= new int[] {4, 5, 6};
        middleWay(a, b);
    }

}
