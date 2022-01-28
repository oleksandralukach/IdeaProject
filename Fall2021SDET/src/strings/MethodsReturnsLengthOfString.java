package strings;

import java.util.Scanner;

public class MethodsReturnsLengthOfString {

    public static void main(String[] args) {

         /*
         1. write a method that takes and input from a user as
         a string and returns the value returned from the second method
         2. write a method that returns the length of the user input when called from first method
          */

        MethodsReturnsLengthOfString obj = new MethodsReturnsLengthOfString();

        // System.out.println("The length of an input: " + obj.takeInput());

        String inputFromUser = obj.takeInput(); // if takeInput() return type is String

        int length = obj.printLength(inputFromUser);
        System.out.println(length);

//        System.out.println( obj.printLength(obj.takeInput()));

//        String finalOutput = "The length is: " + new MethodsReturnsLengthOfString().printLength
//                (new MethodsReturnsLengthOfString().takeInput());
//        System.out.println(finalOutput);

    }

     String takeInput (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter anything: ");

        // we have created a String variable that points to user's input from scanner
        // (not storing it but referring to)
        String input = scan.nextLine();

        // calling a method and saving it return to new variable)
        //int lengthForUserInput = printLength(input);

        return input;

         // String result = "Length of your input: " + getLength(usersInput);
         // return result;

     }

    int printLength(String userInput){

        int length = userInput.length();

        return length;
    }
}
