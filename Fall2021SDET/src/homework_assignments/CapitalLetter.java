package homework_assignments;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        /*
Write a Java program to check if a string starts with a capital letter.
Example:
Input the string: Hello world
Expected Output
true
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char userInput = input.next().charAt(0);


        // using ASCII table for all capital letters
        if (userInput >= 65 && userInput <= 90) {
            System.out.println("True. String starts with uppercase");
        } else if (userInput >= 97 && userInput <= 122)
            System.out.println("False. String starts with lowercase");
        else
            System.out.println("Invalid input");

//        other way(A to Z):
//        if (userInput >= 'A' && userInput <= 'Z'){
//            System.out.println("true");
//        } else
//            System.out.println("false");


//        other way (just for checking 'H' letter in "Hello World" String)
//        if (userInput == 'H')
//            System.out.println("True");
//        else
//            System.out.println("False");

//        String input = scan.next();
//        if (input.charAt(0) == 'H')
//            System.out.println("True");
//        else
//            System.out.println("False");

//        switch (input){
//            case "Hello world":
//            case "Hello World":
//                System.out.println(true);
//                break;
//            case "hello world":
//            case "hello World":
//                System.out.println(false);
//                break;
//            default:
//                System.out.println("Invalid input");
//        }

    }
}
