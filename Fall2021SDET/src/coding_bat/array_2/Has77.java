package coding_bat.array_2;

public class Has77 {
    /*

    Given an array of ints, return true if the array contains two 7's next to each other,
     or there are two 7's separated by one element, such as with {7, 1, 7}.
     */
    public static void main(String[] args) {
        int[]arr = {2, 7, 2, 2, 7, 2};

        System.out.println(has77(arr));
    }

    public static boolean has77(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
             return true;
            } else if (i <= nums.length - 3 && nums[i] == 7 && nums[i + 2] == 7) {
               return true;
            }

        }
        return false;
    }
}