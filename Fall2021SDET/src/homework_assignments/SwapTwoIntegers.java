package homework_assignments;

public class SwapTwoIntegers {
    /*
    Write a program called Swap2Integers that prompts user for two integers.
    The program shall read the inputs as int, save in two variables called number1 and number2;
    swap the contents of the two variables; and print the results. For examples,
Enter first integer: 9
Enter second integer: -9
After the swap, first integer is: -9, second integer is: 9
     */
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = -9;

        n1 = n2;
        n2 = n2 * (-1);

        System.out.println("First integer is " + n1 + "\nSecond integer is " + n2);
    }
}
