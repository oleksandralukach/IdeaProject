package arrays.multidimesionall_arrays;

import java.util.Arrays;

public class JaggedArraysWithNumbers {

    public static void main(String[] args) {

        int [][] numbers = new int [3][]; // {{null}, {null}, {null}}

//        numbers[0][1] = 14;
//        System.out.println(numbers[0][1]); // exception: because "numbers[0]" is null

        numbers[0] = new int [2]; // {{x,x}, {null}, {null}} //initializing size of index 0 array
        numbers [0][0] = 7;// {{7,0}, {null}, {null}}
        numbers [0][1] = 4; // {{7,4}, {null}, {null}}

        numbers [2] = new int [5]; // {{7,4, {null}, {x,x,x,x,x}}
        numbers [2][0] = 89;// {{7,4, {null}, {89,0,0,0,0}}
        numbers [2][1] = 76;// {{7,4, {null}, {89,76,0,0,0}}
        numbers [2][4] = 3;// {{7,4, {null}, {89,76,0,0,3}}

        System.out.println(Arrays.toString(numbers[0]));
        System.out.println(Arrays.toString(numbers[1]));
        System.out.println(Arrays.toString(numbers[2]));
    }
}
