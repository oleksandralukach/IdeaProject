package coding_bat.array_1;

import java.util.Arrays;

public class Arrays1MakeEnds {
    /*
    Given an array of ints, return a new array length 2
    containing the first and last elements from the original array.
    The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
     */
    public static void main(String[] args) {

        int[] a = new int[] {1, 2, 3};
        makeEnds(a);

    }
    public static int[] makeEnds(int[] nums) {
        int[] newArr = new int[2];

        newArr[0] = nums[0];
        newArr[1] = nums[nums.length -1];

        System.out.println(Arrays.toString(newArr));

        return newArr;


    }
}
