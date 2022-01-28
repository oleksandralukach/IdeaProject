package switch_case;

import java.util.Scanner;

public class SwitchIntro {

    public static void main(String[] args) {

        // Help me write a program which will print out if the given animal is domesticestic or wild animal

        // EX: dog, cat, hamster, chicken -> domesticestic
        // EX: tiger, lion, monkey, bear -> wild


//        if(animal == "dog") System.out.println("domesticestic");
//        else if(animal =="cat") System.out.println("domesticestic");
//        else if(animal =="hamster") System.out.println("domesticestic");
//        else if(animal =="chicken") System.out.println("domesticestic");
//        else System.out.println("Wild");
//
//        if (animal == "cat" || animal == "dog" || animal == "hamster" || animal == "chicken") {
//            System.out.println("domesticestic");
//        } else if (animal == "tiger" || animal == "lion" || animal == "wild cat" || animal == "sea lion") {
//            System.out.println("Wild");
//        } else {
//            System.out.println("Sorry we don't recognize this animal");
//        }

        // Every switch statement can be replaced by if-else-if statement
        // however not all if-else-if statements can be replaced by switch

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name of animal: ");
        String animal = scan.nextLine();
        String domestic = "Domestic";
        String wild = "Wild";

        // .equals()
        switch (animal) {
            case "cat":
                System.out.println(domestic);
            case "dog":
                System.out.println(domestic);

            case "chicken", "hamster":
                System.out.println(domestic);
                break;

            case "eagle":
            case "lion":
            case "wild cat":
            case "sea lion":
                System.out.println(wild);
                break;

            default:
                System.out.println("Sorry we do not know the type of animal!");
                break;
        }

        /*
        The switch statement is one of the more syntactically complicated expressions in Java.
        Syntax for switch:switch (expression) {switch-case ...}
        Syntax for switch-case:case expression:statement or default :statement;
        - break is optional and if we do not put break then if the current
        case is true then java will jump to the next cases' statement body until the next break,
        in other words omitting the break statement causes execution to continue with the
        next case statement without testing the expression.
        - The expression in the switch statement must be of type char, byte, short, or int, String class.
        It cannot be boolean, float, double. It also works with enumerated types and and
        a few special "wrapper" classes: Character, Byte, Short, and Integer.
        - switch is for fixed number of cases where you will have to work with one variable at a time as a parameter;
        - you are restricted to use the data type of the parameter for cases;
        - can only compare '==' [primitive comparisons] or .equals() [Non primitive comparisons];
        - easy to read;
         */

        // 'break' ends checking statements when it founds the right one and
        // skips next cases' body statements
        // when we don't put 'break' it continues to next cases statement (without testing the case expression)
        // until it sees 'break'
        // we can put 'default' statement anywhere in switch case but better to keep it at the end
        // if expression parameter is string every case needs to be string
    }
}
