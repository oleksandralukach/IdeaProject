package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitString {
    /**
     * String name = Antarctica;
     * Create a method which will split the name based on users input
     * input = 3 for example
     * output:
     * ant arc tic a
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Antarctica";
        splitString(name, scan);
    }

    public static String splitString(String name, Scanner scan) {

        System.out.println("Enter the number to split the name");
        int splitIndex = scan.nextInt();

        StringBuilder newStr = new StringBuilder();
        newStr.append(name.substring(0,splitIndex));
        newStr.append(" ");
        newStr.append(name.substring(splitIndex));

        System.out.println(newStr);
        return newStr.toString();
    }
}