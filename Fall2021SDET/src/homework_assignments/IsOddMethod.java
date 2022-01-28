package homework_assignments;

import java.util.Scanner;

public class IsOddMethod {

    /*
Write a boolean method called isOdd() in a class called OddEvenTest,
which takes an int as input and returns true if the int is odd. The signature of the method is as follows:

public static boolean isOdd(int number);
Also write the main() method that prompts user for a number, and prints "ODD" or "EVEN".
You should test for negative input. For examples,

Enter a number: 9
9 is an odd number

Enter a number: 8
8 is an even number

Enter a number: -5
-5 is an odd number
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int inputNum = scan.nextInt();

        if (isOdd(inputNum)){
            System.out.println(inputNum + " is an even number");
        }
        else
            System.out.println(inputNum + " is an odd number");
    }

    public static boolean isOdd(int number){

        if(number % 2 == 0){
            return true;
        }
        else
            return false;
    }

}
