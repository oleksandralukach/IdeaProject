package coding_bat.array_2;


/**
 * Given an array of ints,
 * return true if the array contains no 1's and no 3's.
 *
 * lucky13([0, 2, 4]) → true
 * lucky13([1, 2, 3]) → false
 * lucky13([1, 2, 4]) → false
 */
public class Lucky13 {



    public boolean lucky13(int[] nums) {

        boolean is13 = true;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 1 || nums[i] == 3){
                is13 = false;
            }

        }
        return is13;

    }
}
