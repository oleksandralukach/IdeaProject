package coding_bat.array_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array of ints,
 * return true if it contains no 1's or it contains no 4's.
 * <p>
 * <p>
 * no14([1, 2, 3]) → true
 * no14([1, 2, 3, 4]) → false
 * no14([2, 3, 4]) → true
 */
public class No4s {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(no14(nums));
    }

    public static boolean no14(int[] nums) {

//        List<int[]> numsList = Arrays.asList(nums);
//        boolean isTrue = true;
//        if (numsList.contains(1) && numsList.contains(4)) {
//            isTrue = false;
//        }
//        return isTrue;

        int one = 0;
        int four = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1)
                one++;

            if(nums[i] == 4) {
                four++;
            }
            if (one >0 && four>0)
                return false;

        }

        return true;
    }
}