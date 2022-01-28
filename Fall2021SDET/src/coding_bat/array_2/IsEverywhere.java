package coding_bat.array_2;

/**
 * We'll say that a value is "everywhere" in an array
 * if for every pair of adjacent elements in the array,
 * at least one of the pair is that value.
 * Return true if the given value is everywhere in the array.
 * <p>
 * <p>
 * isEverywhere([1, 2, 1, 3], 1) → true
 * isEverywhere([1, 2, 1, 3], 2) → false
 * isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
public class IsEverywhere {


    public boolean isEverywhere(int[] nums, int val) {

        //Pseudocode:
        // at least one element in pair should be val [i or i+1]

        // This one not working. Why?

        boolean isE = false;
        if(nums.length < 2 && nums[0] != val)
            return true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == val || nums[i + 1] == val) {
                isE = true;
            } else isE = false;
        }
        return isE;

        //===================================================
        // Those two working fine. What the difference?
        //1.

//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == val || nums[i + 1] == val) ;
//            else return false;
//        }
//        return true;

        //========================================================
        // 2.

//        int len = nums.length;
//        if (len < 2) return true;
//        boolean isE = false;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == val || nums[i + 1] == val) {
//                isE = true;
//            } else {
//                return false;
//            }
//        }
//        return isE;
    }
}

