package coding_bat;

import java.util.Arrays;

public class MaxEnd3 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(maxEnd3(nums)));
    }

    public static int[] maxEnd3(int[] nums) {

        int largest = 0;
        int[] arrWithLargestNum = new int[nums.length];

        if (nums[0]>nums[2]){
            largest = nums[0];}
        else if (nums[2]>nums[0]){
            largest = nums[2];}
        else if (nums[0]==nums[2]){
            largest = nums[0];
        }

        for(int i = 0; i < arrWithLargestNum.length; i++){
            arrWithLargestNum[i] = largest;
        }

        return arrWithLargestNum;
    }
}
