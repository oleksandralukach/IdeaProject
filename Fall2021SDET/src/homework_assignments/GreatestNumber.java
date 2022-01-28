package homework_assignments;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        /*
        Take two numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 87
Expected Output :
The greatest: 87
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter 1st number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter 2nd number: ");
        int num2 = s.nextInt();

        //using ternary operator:
        String greatestNum = num1 > num2 ? "The greatest number is " + num1 : "The greatest number is " + num2;
        System.out.println("The greatest: " + greatestNum);

        // using if statement:
        /* if (num1 > num2){
            System.out.println("The greatest number is " + num1);
        }
        else {
            System.out.println("The greatest number is " + num2);
        }
        */
        }
}
