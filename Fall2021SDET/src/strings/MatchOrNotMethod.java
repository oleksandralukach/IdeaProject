package strings;

import java.util.Locale;
import java.util.Scanner;

public class MatchOrNotMethod {

    public static void main(String[] args) {

        String result = matchOrNot("Hello", "HELLO");
        System.out.println(result);
    }

    public static String matchOrNot(String str1, String str2) {

        String matchOrNot = "";
        boolean isEqual = str1.toUpperCase().equals(str2.toUpperCase());

        if (isEqual) {
            matchOrNot = "Found match";
        } else
            matchOrNot = "not a match";

        return matchOrNot;

    }

//    Scanner scan = new Scanner(System.in);
//    System.out.println("Please enter a word #1: ")
//    String str1 = scan.nextLine().toUpperCase();
//    System.out.println("Please enter a word #2: ")
//    String str2 = scan.nextLine().toUpperCase();
}
