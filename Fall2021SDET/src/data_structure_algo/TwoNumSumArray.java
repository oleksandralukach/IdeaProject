package data_structure_algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TwoNumSumArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, -4, 8, 11, 1, 6, 1, -4};
        int target = 10;

        TwoNumSumArray obj = new TwoNumSumArray();
        int[] returnTwoNumSum = obj.returnTwoNumSum(nums,target);


    }

    public int[] returnTwoNumSum(int[] nums, int target) {
        int[] returnTwoNumSum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    returnTwoNumSum[0] = nums[i];
                    returnTwoNumSum[1] = nums[j];
                }
            }
        }
        System.out.println(Arrays.toString(returnTwoNumSum));
        return returnTwoNumSum;
    }
}
