package arrays;

import java.util.Arrays;

public class ArraysWithForEachLoop {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 7;

        // prints out value of each element
        for(int i : arr)
        {
            System.out.println(i);
        }

        System.out.println("===============================================================================");

        // using regular for loop
        for(int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("==============================================================================");

        // 5 times will print the whole collection of vars
        for(int i : arr)
        {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("=============================================================================");

        // sum of all numbers in array:
        int sum = 0;

        for(int currentNum : arr)
        {
            sum += currentNum;
        }

        System.out.println("The sum of numbers in array " + Arrays.toString(arr) + " is " + sum);

        System.out.println("=============================================================================");

        // sum of elements using regular loop (just elements at even indexes):
        int sumWithRegularLoop = 0;
        for (int i= 0; i < arr.length; i = i+2 ){ // or { if (i % 2 == 0) ... }
            sumWithRegularLoop += arr[i];
        }
        System.out.println("Sum of elements at even indexes: " + sumWithRegularLoop);

        System.out.println("=============================================================================");

        int [] numbers = {1,2,3,4,5};

        for (int i = 0; i < arr.length; i++)
        {
            if(numbers[i] % 2 == 0)
            {
                continue;
            }
            System.out.println(numbers[i]);
        }

    }
}
