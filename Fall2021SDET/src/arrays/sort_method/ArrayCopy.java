package arrays.sort_method;

import java.util.Arrays;

public class ArrayCopy {

    // since Array are mutable, it is better to use Arrays.copyOf() method
    // to make a copy of an Array
    public static void main(String[] args) {

        int [] nums = {3, 2, 4, 7, 8};
        int [] numsCopy = nums;

        System.out.println("Before change: " + Arrays.toString(nums));
        System.out.println("After: " + Arrays.toString(numsCopy));

        nums[1] = 9;
        System.out.println("Before change: " + Arrays.toString(nums));
        System.out.println("After: " + Arrays.toString(numsCopy));
        numsCopy[3] = 25;
        System.out.println("Before change: " + Arrays.toString(nums));
        System.out.println("After: " + Arrays.toString(numsCopy));

        int [] temps = {65, 73, 34, 78};
        //int[] tempsCopy = new int [temps.length];

        System.out.println(Arrays.toString(temps));
        //System.out.println(Arrays.toString(tempsCopy));

        int[]tempsCopy = Arrays.copyOf(temps,temps.length);
        System.out.println("After copying temps to tempsCopy " + Arrays.toString(tempsCopy));


    }
}
