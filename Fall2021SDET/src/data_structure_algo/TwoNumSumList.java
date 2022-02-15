package data_structure_algo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumSumList {
    /**
     * Given an array of integers,
     * return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     * Example: Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1]
     */

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        int targetSum = 9;

        TwoNumSumList twoNumberSum = new TwoNumSumList();
        System.out.println(Arrays.toString(twoNumberSum.findNum(arr, targetSum)));
        System.out.println(Arrays.toString(twoNumberSum.findNum2(arr, targetSum)));
        System.out.println(Arrays.toString(twoNumberSum.twoSum2(arr,targetSum)));
    }

    public int[] findNum(int[] arr, int targetSum) {
        int[] returnArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] + arr[j] == targetSum && i != j) {
                    returnArr[0] = i;
                    returnArr[1] = j;
                    break;
                }
            }
        }
        return returnArr;
    }

    //======================================================

    public int[] findNum2(int[] arr, int targetSum) {
        int[] returnArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int difference = targetSum-arr[i]; //7
            if (arr[i] == difference && i != arr[difference]){
                return new int[]{i, arr[difference]};
            }
        }

        return null;
    }

    /**
     * Algorithm
     * Approach 2: Two-pass Hash Table
     * A simple implementation uses two iterations.
     * In the first iteration, we add each element's value as a key and its index as a value to the hash table.
     * hen, in the second iteration, we check if each element's complement
     * (target - nums[i]target−nums[i]) exists in the hash table.
     * If it does exist, we return current element's index and its complement's index.
     * Beware that the complement must not be nums[i]nums[i] itself!
     */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // key = element, value = index of that element (nums[0], 0) -> (2,0)(3,1)(5,2)(7,3)
        }
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i]; // 9 - 2
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[] { i, map.get(diff) }; //(0,3)
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

    /**
     * Approach 3: One-pass Hash Table
     * Algorithm
     * It turns out we can do it in one-pass.
     * While we are iterating and inserting elements into the hash table,
     * we also look back to check if current element's complement already exists in the hash table.
     * If it exists, we have found a solution and return the indices immediately.
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) { //first checking and then putting in map
            int diff = target - nums[i]; //7 6 4
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            map.put(nums[i], i); //(2, 0) (3, 0)
            // key = element, value = index of that element (nums[0], 0) -> (2,0)(3,1)(5,2)(7,3)
        }
        // In case there is no solution, we'll just return null
        return null;
    }


}
