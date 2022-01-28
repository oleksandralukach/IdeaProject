package homework_assignments;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        /*
        1. Write a Java program to get a number from the user and print whether it is positive or negative.
        Test Data
        Input number: 35
        Expected Output :
        Number is positive
         */
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int num = s.nextInt();

        if (num >= 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is negative");
        }

        // String result = num >=0 ? "Number is positive" : "Number is negative";
        // System.out.println(result);
    }
}
