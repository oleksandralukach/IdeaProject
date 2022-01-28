package homework_assignments;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        /*
Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password");
        int passwordInput = scan.nextInt();

        checkPassword(passwordInput);
    }
    public static void checkPassword(int password){
        int validPassword = 123;

        if (password == validPassword) {
            System.out.println("The password is valid");
        } else
            System.out.println("The password is invalid");
    }
}
