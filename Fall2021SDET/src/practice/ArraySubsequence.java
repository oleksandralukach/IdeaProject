package practice;

public class ArraySubsequence {
    public static void main(String[] args) {

        int[] target = new int[]{2, 3, 4};
        int[] nums2 = new int[]{1, 2, 3, 4, 1};

        System.out.println(isSubsequence(target, nums2));
    }

    public static boolean isSubsequence(int[] target, int[] num2) {

        int j = 0;

        for (int i = 0; j < target.length && i < num2.length; i++) {
            if (target[j] == num2[i]) {
                j++;
                if (j == target.length) break;
                else if (target[j] != num2[i + 1]) {
                    return false;
                }
            }
        }
        return j == target.length;
    }
}
