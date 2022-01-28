package practice;

import java.util.*;

public class SpecificElement {
    /*
Write a Java program to remove a specific element from an array of integer numbers.
4 integer numbers take from the user. Ask a user which element he/she wants to remove.

Original Array : [25, 14, 56, 49]
After removing the second element: [25, 14, 49]

Requirements:
   1. Entered number should be in range: 1 to 45 (Otherwise: print error)
   2. Program accepts only whole numbers (No decimals, no characters).
   3. If the user entered char, print message: "Please enter the number, not a character!".
   4. If the user entered an element that is not available in the array, print "PLease choose correct element!".
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In this program you will remove a specific element from an array of 4 numbers.");
        int[] arr = {25, 14, 56, 49};

        removeSpecificElement(arr, scan);
    }

    public static int[] removeSpecificElement(int[] arr, Scanner scan) {
        List<Integer> removeSpecificElement = new LinkedList<>();
        int[] removedElement = new int[arr.length - 1];
        int target = 0;
        try {
            System.out.println("Please input number of element which you want to remove from array: " +
                    "\n1, 2, 3, or 4: ");
            target = scan.nextInt();
            System.out.println("Original Array : [25, 14, 56, 49]");
        } catch (InputMismatchException e) {
            System.out.println("1.Please enter the number, not a character!");
            System.out.println("2.Please enter whole number, no decimal points!");
            System.exit(0);
        }

        try {
            for (int i = 0, k = 0; i < arr.length; i++) {
                // if the index is the removal element index
                if (i == target - 1) {
                    continue;
                }
                // if the index is not the removal element index
                removedElement[k++] = arr[i];
            }
            System.out.println("After removing the second element: " + Arrays.toString(removedElement));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("PLease choose correct element!");
        }

        return removedElement;
    }
}
