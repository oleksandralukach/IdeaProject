package homework_assignments;

// Write a program called CheckOddEven which prints "Odd Number"
// if the int variable “number” is odd, or “Even Number” otherwise.
// The program shall always print “bye!” before exiting.
//Hints
//n is an even number if (n % 2) is 0; otherwise, it is an odd number.
// Use == for comparison, e.g., (n % 2) == 0.

/**
 * Trying if-else statement and modulus (%) operator.
 */
public class CheckOddEven {
    public static void main(String[] args) {
        int number = 49;
        System.out.println("The number is " + number);
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("bye!");
    }
}

