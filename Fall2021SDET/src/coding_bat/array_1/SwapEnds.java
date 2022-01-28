package coding_bat.array_1;

import java.util.Arrays;

/**
 * Given an array of ints,
 * swap the first and last elements in the array.
 * Return the modified array.
 * The array length will be at least 1.
 *
 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
 * swapEnds([1, 2, 3]) → [3, 2, 1]
 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

public class SwapEnds {

    public static void main(String[] args) {
        int[] b = {5, 6, 8};

        SwapEnds obj = new SwapEnds();
        System.out.println(Arrays.toString(obj.swapEnds(b)));

    }
    public int[] swapEnds(int[] nums) {

        int a = nums[nums.length-1];
        int b = nums[0];

        nums[0] = a;
        nums[nums.length-1] = b;

//=============================================================
//
//        int [] newArray = new int[nums.length];
//
//        for(int i = 1; i < nums.length - 1; ++i)
//            newArray[i] += nums[i];
//        newArray[0] = nums[nums.length-1];
//        newArray[nums.length-1] = nums[0];
//        return newArray;

        return nums;

    }

}
