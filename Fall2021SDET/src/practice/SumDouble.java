package practice;

import java.util.Scanner;

public class SumDouble {
    public static void main(String[] args) {

    Scanner sr = new Scanner(System.in);

        System.out.println("Please, enter first value: ");
    int first = sr.nextInt();

        System.out.println("Please, enter second value: ");
    int second = sr.nextInt();

    String result = sumDouble(first, second);
        System.out.println(result);

}

    public static String sumDouble(int a, int b) {
        if (a > 0 && a <= 99 && b > 0 && b <= 99) {
            if (a == b)
                return "DoubleSum = " + (a + b) * 2;
            else {
                return a + b + "";
            }
        } else return "Entered values should be in range from 1 to 99";
    }
}

