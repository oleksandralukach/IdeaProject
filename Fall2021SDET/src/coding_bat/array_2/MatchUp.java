package coding_bat.array_2;

public class MatchUp {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3};
        int[] num2 = {2, 3, 10};

        int countDifferenceOf2OrLess = matchUp(num1, num2);
        System.out.println(countDifferenceOf2OrLess);
    }

    public static int matchUp(int[] num1, int[] num2) {

        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            int result = Math.abs(num1[i] - num2[i]);
            if (result <= 2 && num1[i] != num2[i]) {
                count++;
            }
        }
        return count;
    }
}
