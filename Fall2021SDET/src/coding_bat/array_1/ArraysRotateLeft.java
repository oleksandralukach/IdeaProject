package coding_bat.array_1;

import java.util.Arrays;

public class ArraysRotateLeft {
    /*

Given an array of ints length 3,
return an array with the elements "rotated left"
so {1, 2, 3} yields {2, 3, 1}.

rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    public static void main(String[] args) {
        int [] nums = {2,0,9};
        System.out.println(Arrays.toString(rotateLeft3(nums)));
    }
    public static int[] rotateLeft3(int[] nums) {

        int[] rotateLeft = new int [3];
        rotateLeft[0] = nums[1];
        rotateLeft[1] = nums[2];
        rotateLeft[2] = nums[0];

        // or just:
        return new int[] {nums[1],nums[2],nums[0]};

    }

}
