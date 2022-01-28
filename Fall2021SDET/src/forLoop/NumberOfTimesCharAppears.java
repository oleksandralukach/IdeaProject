package forLoop;

import java.util.Scanner;

public class NumberOfTimesCharAppears {

    /* Write a method: public static int findNumOfAppears (String str, char c)
    find number of times the character appears in the given loop
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word or sentence");
        String wordOrSentence = scan.nextLine();
        System.out.println("Enter char to be checked");
        char target = scan.nextLine().charAt(0);

        System.out.println(findNumOfTimesCharFromString(wordOrSentence.toLowerCase(), target));

    }

    public static int findNumOfTimesCharFromString(String str, char c) {
        int numberOfTimes = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c) {
                numberOfTimes += 1; // numberOfTimes++
            }

        }
        return numberOfTimes;
    }
}
