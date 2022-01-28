package homework_assignments;

import java.util.Scanner;

public class CommonDigits {

    public static void main(String[] args) {
        /* Write a Java program that accepts two integer values between 25 and 75
        and return true if there is a common digit in both numbers.
        Sample Output:
Input the first number : 35
Input the second number: 45
Result: true
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please input number_1 values between 25 and 75 ");
        int num1 = input.nextInt();
        System.out.println("Please input number_2 values between 25 and 75 ");
        int num2 = input.nextInt();

        int firstDigitNum1 = num1/10;
        int firstDigitNum2 = num2/10;
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;

        if (num1 > 25 && num1 < 75 && num2 > 25 && num2 < 75){

            System.out.println("Lets return 'true' if they have a common digit and 'false' if they don't");

            if(firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == lastDigitNum2
                    || firstDigitNum2 == lastDigitNum1 || lastDigitNum1 == lastDigitNum2) {
                System.out.println("true");
            }
            else if((firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == lastDigitNum2
                    || firstDigitNum2 == lastDigitNum1 || lastDigitNum1 == lastDigitNum2) == false){
                System.out.println("false");
            }
        }
            else {
            System.out.println("Your entered numbers are out of range '25 to 75'.");
        }
    }
}
