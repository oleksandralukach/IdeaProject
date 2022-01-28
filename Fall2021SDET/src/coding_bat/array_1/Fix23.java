package coding_bat.array_1;

import java.util.Arrays;

public class Fix23 {
    /*

Given an int array length 3, if there is a 2 in the array
immediately followed by a 3, set the 3 element to 0.
Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
     */
    public static int[] fix23(int[] nums) {

        int[] newArr = new int[nums.length];
        newArr[0] = nums[0];
        newArr[1] = nums[1];
        newArr[2] = nums[2];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 2 && nums[i+1] == 3){
                    newArr[i+1] = 0;
            }
        }

        return newArr;
    }

    public static void main(String[] args) {

        int[] a= new int[] {2, 3, 9};

        System.out.println(Arrays.toString(fix23(a)));
    }

}
