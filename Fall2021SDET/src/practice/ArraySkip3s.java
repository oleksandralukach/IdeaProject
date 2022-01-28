package practice;

public class ArraySkip3s {

    public static void main(String[] args) {

        // print number in array but skip 3's
        // start at the middle of the array -> int start = nums.length/2

        int[] nums = {1, 8, 4, 3, 7, 9, 99};
        int lastNum = nums.length-1; //if(lastNum < 0)
        int start = -1;
        //int n = 0;

//        while (start < nums.length-1) {
//            n++;
//
//            if (nums[n] == 3) {
//                continue;
//            }
//            System.out.println(nums[n]);
//        }

        while (lastNum >= 0) {
            if (nums[lastNum] == 3) {
                lastNum--;
            }
            System.out.println(nums[lastNum]);
            lastNum--;
        }
    }
}
