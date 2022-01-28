package coding_bat.array_2;

/**
 * Given an array of ints,
 * return true if every element is a 1 or a 4.
 * <p>
 * <p>
 * only14([1, 4, 1, 4]) → true
 * only14([1, 4, 2, 4]) → false
 * only14([1, 1]) → true
 */
public class Only14 {
    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 4};
        Only14 o = new Only14();
        System.out.println(o.only14(nums));
    }

    public boolean only14(int[] nums) {
        boolean isTrue = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                isTrue = false;
                return isTrue;
            }
        }
        return isTrue;

        //or:
//        int amount = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(nums[i] == 1 || nums[i] == 4) {
//                amount++;
//            }
//        }
//
//        if(amount == nums.length){
//            return true;
//        } else {
//            return false;
//        }
    }
}
