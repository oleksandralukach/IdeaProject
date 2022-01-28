package while_loop;

import java.util.Scanner;

public class ReverseStringWithWhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a word: ");
        String inputWord = scan.nextLine(); // creating string object with input from user

        String reversedString = reverseString(inputWord).toString();
        System.out.println(reversedString);

    }

    static StringBuilder reverseString(String str) {

        StringBuilder sb = new StringBuilder();

        int index = str.length() -1; // to point to last index in string // starting point of the loop

        while (index >= 0){

            sb.append(str.charAt(index)); // adding letter at last index to empty sb
            index--;
        }
        return sb;

    }
}
