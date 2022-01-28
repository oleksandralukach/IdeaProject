package coding_bat.array_1;

import java.sql.Array;

/**
 * Given an array of ints of even length,
 * return a new array length 2 containing
 * the middle two elements from the original array.
 * The original array will be length 2 or more.
 * <p>
 * makeMiddle([1, 2, 3, 4]) → [2, 3]
 * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
 * makeMiddle([1, 2]) → [1, 2]
 */
public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {

        int[] newArr = new int[2];

        newArr[0] = nums[nums.length / 2 - 1];
        newArr[1] = nums[nums.length/2];

        return newArr;
    }
}

