package coding_bat.array_1;

import java.util.Arrays;

public class MaxTriple {
    /**
     * Given an array of ints of odd length,
     * look at the first, last, and middle values in the array and return the largest.
     * The array length will be a least 1.
     * <p>
     * <p>
     * maxTriple([1, 2, 3]) → 3
     * maxTriple([1, 5, 3]) → 5
     * maxTriple([5, 2, 3]) → 5
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(maxTriple(nums));
    }
    public static int maxTriple(int[] nums) {

        int largestElementInArray = 0;

        int firstElement = nums[0];
        int middleElement = nums[nums.length/2];
        int lastElement = nums[nums.length-1];

            if(firstElement>middleElement && firstElement>lastElement)
                largestElementInArray = firstElement;
            if(middleElement>firstElement && middleElement>lastElement)
                largestElementInArray = middleElement;
            if(lastElement>middleElement && lastElement>firstElement)
                largestElementInArray = lastElement;

        return largestElementInArray;
    }
}
