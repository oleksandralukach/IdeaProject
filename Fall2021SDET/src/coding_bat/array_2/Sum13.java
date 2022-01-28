package coding_bat.array_2;

import java.util.*;

/**
 * Return the sum of the numbers in the array,
 * returning 0 for an empty array. Except the number 13 is very unlucky,
 * so it does not count and numbers that come immediately after a 13 also do not count.
 * <p>
 * sum13([1, 2, 2, 1]) → 6
 * sum13([1, 1]) → 2
 * sum13([1, 2, 2, 1, 13]) → 6
 */

public class Sum13 {

    public static void main(String[] args) {

        int[] nums = {1, 13, 2, 2, 1};

        Sum13 obj = new Sum13();
        System.out.println(obj.sum13(nums));

    }

    public int sum13(int[] nums) {

        int sum = 0;

        if (nums.length == 0) {
            return sum;
        } else if (nums.length > 0) {

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 13 || (i> 0 && nums[i-1] == 13)) {
                    continue;
                }
                sum += nums[i];
            }
        }

        return sum;
    }
}
