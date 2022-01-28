package homework_assignments;

import java.util.Scanner;

public class CheckPasswordString {
    public static void main(String[] args) {
                /*
Write a Java method to check whether a string is a valid password.
Password rules:
1. A password must have at least ten characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = scan.nextLine();

        checkPassword(password);
    }
    public static void checkPassword(String password){
        String validPassword = "";

        if (password.length() >= 10 && password.equals('A')) {
            System.out.println("The password is valid");
        } else
            System.out.println("The password is invalid");
    }
}
