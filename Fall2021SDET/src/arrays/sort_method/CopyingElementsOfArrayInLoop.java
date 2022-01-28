package arrays.sort_method;

import java.util.Arrays;

public class CopyingElementsOfArrayInLoop {
    public static void main(String[] args) {

        // save way to copy array:

        int[] numbers = {8, 4, 3, 9, 7};
        int [] numbers2 = new int [numbers.length]; // [0,0,0,0,0] same size as 'numbers'

        for (int i = 0; i < numbers.length; i++){
            numbers2[i] = numbers[i]; // each element will be assigned the value of numbers[] elements

        }
        System.out.println(Arrays.toString(numbers2));
    }
}
