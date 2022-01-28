package practice;

import java.util.Scanner;

public class NumbersInAString {

    /*
    Input a String as a user
    identify numbers in it and return them as a String

    given input: "dev1x2 3school5"
    exp output: "12345" > string
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a String");
        String str = scan.nextLine();

        System.out.println(identifyNumbers(str));

    }

    public static String identifyNumbers (String str){
        String numbers = "";

        for (int i = 1; i < str.length(); i++){

            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
            numbers += str.charAt(i);

        }

        return numbers;
    }
}
