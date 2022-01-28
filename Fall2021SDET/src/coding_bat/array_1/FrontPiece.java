package coding_bat.array_1;

/**
 * Given an int array of any length,
 * return a new array of its first 2 elements.
 * If the array is smaller than length 2,
 * use whatever elements are present.
 * <p>
 * frontPiece([1, 2, 3]) → [1, 2]
 * frontPiece([1, 2]) → [1, 2]
 * frontPiece([1]) → [1]
 */
public class FrontPiece {

    public int[] frontPiece(int[] nums) {

        int[] newArr = new int[2];

        if (nums.length < 2) {
            return nums;
        } else{
            newArr[0] = nums[0];
            newArr[1] = nums[1];}

        return newArr;

        // other:

//        if (nums.length == 1)
//        return new int[] {nums[0]};

//  else if (nums.length == 0)
//        return new int[] {};

//  else
//        return new int[] {nums[0],nums[1]};

    }
}
