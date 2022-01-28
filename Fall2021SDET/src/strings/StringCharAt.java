package strings;

import java.util.Scanner;

public class StringCharAt {
    //      public char charAt (int index) {
    //            return char;
    //      }
    // charAt() method returns a character at specific index within the String variable

    public static void main(String[] args) {

        System.out.println("Devx".charAt(2)); // index of 'v' is 2 in "Devx"

        String spaceX = "Project Mars";

        char beforeWhiteSpace = spaceX.charAt(6);
        System.out.println("The char at position before white space is: " + beforeWhiteSpace);

        // Expected output: t M
        char whiteSpace = spaceX.charAt(7);
        char charM = spaceX.charAt(8);

        System.out.println("" + beforeWhiteSpace + whiteSpace + charM);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or sentence:");
        String userInput = input.nextLine();
        System.out.println("The length of the input is: " + userInput.length());

        // str.length()-1 will always return the char at the end of String [last character of a String]
        int indexOfLastChar = userInput.length()-1;
        System.out.println("The index of last char is: " + indexOfLastChar);
        // storing the last character of a String in charAtLastIndex variable
        char charAtLastIndex = userInput.charAt(indexOfLastChar);

        System.out.println("The last char is: " + charAtLastIndex);
    }
}
