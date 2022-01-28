package coding_bat.array_2;

/**
 * Given an array of ints,
 * return true if the sum of all the 2's in the array is exactly 8.
 * <p>
 * sum28([2, 3, 2, 2, 4, 2]) → true
 * sum28([2, 3, 2, 2, 4, 2, 2]) → false
 * sum28([1, 2, 3, 4]) → false
 */

public class Sum28 {

    public boolean sum28(int[] nums) {

        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==2){
                count2++;
            }

        }
        if(count2 * 2 == 8){
            return true;
        }

        return false;
    }
}
