package homework_assignments;

import java.util.Scanner;

public class FirstCharDigit {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println('j' + 'a' + 'v' + 'a');

        System.out.println("=========================================================================");

//        String name = "Alex";
//        System.out.println(name.charAt(0));
//
//        System.out.println("=========================================================================");
//
//        System.out.println("Please enter a character: ");
//        char a = keyboard.next().charAt(0);
//        System.out.println("The value assigned to a is: " + a);
//
        System.out.println("=========================================================================");

        // take input as a string from user
        // and check the first char and identify if its digit or not
        // if it's a digit
        // if not then "It's not a digit"
        //Ex. "23 Oak Str, Miami, Fl"

        System.out.println("Please enter a text: ");
        //String text = keyboard.nextLine();

        char firstChar = keyboard.next().charAt(0);
        System.out.println("The first char is: " + firstChar);

        if (firstChar == '1'
                || firstChar == '2'
                || firstChar == '3'
                || firstChar == '4'
                || firstChar == '5'
                || firstChar == '6'
                || firstChar == '7'
                || firstChar == '8'
                || firstChar == '9'
                || firstChar == '0') {
            System.out.println("First char is a digit");
        }
        else
            System.out.println("It's not a digit");

        // other option:
        if (firstChar >= '0' && firstChar <= '9')
            System.out.println("First char is a digit");
        else
            System.out.println("It's not a digit");

        // other option:
        if(firstChar >= 48 && firstChar <= 57)
            System.out.println("First char is a digit");
        else
            System.out.println("It's not a digit");

        System.out.println("=========================================================================");

    }
}
