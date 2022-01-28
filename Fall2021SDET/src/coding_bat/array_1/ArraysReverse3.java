package coding_bat.array_1;

import java.util.Arrays;

public class ArraysReverse3 {

    /*
Given an array of ints length 3,
return a new array with the elements in reverse order,
so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.println(Arrays.toString(reverse3(nums)));

    }

    public static int[] reverse3(int[] nums) {

        int[] reverseArr = new int[nums.length];

        // Solution 1:

//        reverseArr[0]=nums[2];
//        reverseArr[1]=nums[1];
//        reverseArr[2]=nums[0];
//        return reverseArr;

        // Solution 2:

//        for (int i = 0, j = nums.length-1; j >= 0; i++, j--) {
//                reverseArr[i] = nums[j];
//            }



        // Solution 3:

//        for (int i = 0; i < nums.length; ++i){
//            reverseArr[i] = nums[nums.length-1-i];
//            }
        //==============================================================
        int i = 0;
        int j = nums.length-1;

        while(i < nums.length){
            reverseArr[i] = nums[j];
            i++;
            j--;
        }

        return reverseArr;
        }
    }
