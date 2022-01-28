package coding_bat.array_1;

public class Arrays1Double23 {
    /*

Given an int array, return true if the array contains 2 twice, or 3 twice.
 The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
     */
    public boolean double23(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            if ((nums[i] == 2 && nums[i + 1] == 2) || (nums[i] == 3 && nums[i + 1] == 3))
                return true;

        }
        // other way by counting 2 and 3 in array
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==2){
            count2++;
            }
            if(nums[i]==3){
            count3++;
            }
            if(count2 == 2 || count3 == 2){
                return true;
            }
        }
            return false;
    }
}
