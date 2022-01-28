package practice;

import java.util.*;

public class DuplicateValues {
    /**
     * Write a Java program to find the duplicate values of an array of integer values.
     * 4 Integer numbers need to take from the user. (With help from Scanner).
     * <p>
     * Sample Output:
     * Duplicate Element: 2
     * Duplicate Element: 5
     * Duplicate Element: 6
     * <p>
     * Requirements:
     * 1. Entered number should be in range: 1 to 45 (Otherwise: print error)
     * 2. Program accepts only whole numbers (No decimals, no characters)
     */

    public static void main(String[] args) {
        System.out.println("In this program you will find duplicate values in array of 4 numbers.");
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[4];
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Please input number " + (i + 1) + " in array(in range: 1 to 45):");
                arr[i] = scan.nextInt();
                if(arr[i]>45 || arr[i]<1){
                    System.err.println("Error! Numbers should be in range: 1 to 45.");
                    System.exit(1);
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Program accepts only whole numbers (No decimals, no characters)." +
                    "\nPlease try again!");
            System.exit(0);
        }

        giveDuplicateValues(arr);
    }

    public static Set<Integer> giveDuplicateValues(int[] arr) {

        //sort first so duplicate elements be by each other
        Arrays.sort(arr);

        // add duplicate elements to Set(it will filter if there is more than 2 repetition of 1 element):
        Set<Integer> duplicateElement = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicateElement.add(arr[i]);
                System.out.println("Duplicate element is " + arr[i]);
            }
        }

        if(duplicateElement.isEmpty()){
            System.out.println("There is no duplicate elements");
        }


        //print out duplicate element / elements / no duplicate elements:
//        if (duplicateElement.size() == 1) {
//            System.out.println("Duplicate Element is : " + duplicateElement);
//        } else if (duplicateElement.size() > 1) {
//            System.out.println("Duplicate Elements are: " + duplicateElement);
//        } else {
//            System.out.println("There is no duplicate elements");
//        }
        return duplicateElement;
    }
}

//        // using nested loop (without sorting) find duplicate
//        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
//
//        for (int i = 0; i < my_array.length - 1; i++) {
//        for (int k = i + 1; j < my_array.length; k++) {
//        if ((my_array[i] == my_array[k]) && (i != k)) {
//        System.out.println("Duplicate Element : " + my_array[k]);
//        }
//        }
//        }