package coding_bat.array_1;

public class ArraysSameFirstLast {
    /*
Given an array of ints,
return true if the array is length 1 or more,
and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1};
        System.out.println(sameFirstLast(nums));
    }

    public static boolean sameFirstLast(int[] nums) {

        if (nums.length > 1 && nums[0] == nums[nums.length -1])
            return true;
        else
            return false;
    }
}
