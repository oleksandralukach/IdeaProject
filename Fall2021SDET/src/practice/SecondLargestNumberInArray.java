package practice;

import java.util.Arrays;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 2, 3};

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);

        System.out.println("_---------------------");
        //sorting
        //Compare the first two elements of the array
        //If the first element is greater than the second swap them.
        //Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
        //Repeat this till the end of the array.
        int temp, size;
        int[] array = {100, 20, 25, 63, 96, 57};
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i]; //96
                    array[i] = array[j]; //57
                    array[j] = temp; //96
                }
            }
        }
        System.out.println("Second largest number is:: " + array[size - 2]);


    }
}

