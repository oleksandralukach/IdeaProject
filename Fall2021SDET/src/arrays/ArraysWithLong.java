package arrays;

import java.util.Arrays;

public class ArraysWithLong {
    public static void main(String[] args) {

        long[] longArr = new long[]{123, 467l, 892, 0L};

//        System.out.println(longArr[0]);
//        System.out.println(longArr[1]);
//        System.out.println(longArr[2]);
//        System.out.println(longArr[3]);

        for (int i = 0; i <= longArr.length-1; i++) {
            System.out.println(longArr[i]);
        }

        long[] emptyLongArr = new long[4];

        System.out.println("The default values of empty long type array: " + Arrays.toString(emptyLongArr));
    }
}
