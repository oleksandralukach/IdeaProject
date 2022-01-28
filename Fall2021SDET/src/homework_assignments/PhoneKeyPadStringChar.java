package homework_assignments;

import java.util.Locale;
import java.util.Scanner;

public class PhoneKeyPadStringChar {

    /*
    On your phone keypad, the alphabets are mapped to digits as follows:
    ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9).
    Write a program called PhoneKeyPad, which prompts user for a String (case insensitive),
    and converts to a sequence of keypad digits. Use (a) a nested-if, (b) a switch-case-default.

Hints
You can use in.next().toLowerCase() to read a String and convert it to lowercase to reduce your cases.
In switch-case, you can handle multiple cases by omitting the break statement, e.g.,

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Please enter a String: ");
        String str = input.next().toLowerCase();

        int digit = 0;

        PhoneKeyPad(str);
    }

    public static int PhoneKeyPad(String inChar) {

        int keypadDigit;
        switch (inChar.charAt(0)) {
            case 'a':
            case 'b':
            case 'c':  // No break for 'a' and 'b', fall thru 'c'
                System.out.print(keypadDigit = 2);
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println(keypadDigit = 3);
                break;
            default:
                System.out.println(keypadDigit = 0);
        }

        return keypadDigit;
    }
}
