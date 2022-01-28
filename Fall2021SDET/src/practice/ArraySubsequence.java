package practice;

public class ArraySubsequence {
    public static void main(String[] args) {

        int[] target = new int[]{1, 3, 4};
        int[] nums2 = new int[]{1, 2, 3, 4, 1};

        System.out.println(isSubsequence(target, nums2));
    }

    public static boolean isSubsequence(int[] target, int[] num2) {

        int j = 0;

        for (int i = 0; j < target.length && i < num2.length; i++) {
            if (target[j] == num2[i]){
                j++;
            }
        }
        return j == target.length;

    }


}
