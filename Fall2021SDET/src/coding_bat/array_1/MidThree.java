package coding_bat.array_1;

import java.util.Arrays;

public class MidThree {
    /**
     * Given an array of ints of odd length,
     * return a new array length 3 containing the elements from the middle of the array.
     * The array length will be at least 3.
     *
     *
     * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
     * midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
     * midThree([1, 2, 3]) → [1, 2, 3]
     */
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(midThree(nums)));

    }
    public static int[] midThree(int[] nums) {

        int startIndex = (nums.length/2)-1;
        int endIndex = (nums.length/2)+1;

        int[] newArr = new int[3];
        newArr[0] = nums[startIndex];
        newArr[1] = nums[nums.length/2];
        newArr[2] = nums[endIndex];


        return newArr;

    }

}
