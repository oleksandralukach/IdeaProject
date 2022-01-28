package homework_assignments;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // % -> returns the remainder of a number divided by another
        // x % 10 -> returns the last digit of a number
        // x % 2 == 0 -> returns 0 for even number,
        // returns 1 for odd numbers (if you add 1 to odd number it will make it even)

        char c1 = 'j';
        char c2 = 'v';
        System.out.println(c1 + c2);
        System.out.println('j' + 'a' + 'v' + 'a');
        System.out.println();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        boolean remainder = num % 2 == 0;

        if (remainder)
            System.out.println("Entered number is even");
        else
            System.out.println("Entered number is odd");

    }
}
