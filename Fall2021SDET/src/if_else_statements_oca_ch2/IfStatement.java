package if_else_statements_oca_ch2;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {
        // statements in java are the code that comes before ";"
        // block of code is zero, single or multiple statements between "{...}"
        // run time is when we actually run our code or during execution
        // compile time is before any code gets executed

        // if-the statement start with if keyword
        // followed by parenthesis and inside the parenthesis boolean expression
        // parenthesis is followed by curly braces for the block of if statement

        // else statements will be used if and only if the 'if' statement evaluates to false
        // else statements are also known as default statement

        String welcomeMsg = "Hello welcome to our site!";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age:");
        short age = input.nextShort();

        if(age >= 18){
            System.out.println(welcomeMsg);
        }
        else {
            System.out.println("Sorry you have to be 18 or older.");
        }

        boolean bool = true;

        // for single statements inside if or else
        // curly braces are optional
        if(!bool)
            System.out.println("This if executed to true!");

        System.out.println("This will get printed no matter what.");

    }


}
