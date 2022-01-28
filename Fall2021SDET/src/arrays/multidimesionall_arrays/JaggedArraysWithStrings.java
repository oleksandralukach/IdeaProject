package arrays.multidimesionall_arrays;

import java.util.Arrays;

public class JaggedArraysWithStrings {

    // jagged array means that the size of nested arrays can be initialized after
    // declaring the size for main array

    public static void main(String[] args) {

        int[]arr = new int[3];
        System.out.println(Arrays.toString(arr));

        boolean[]bool = new boolean[2];
        System.out.println(Arrays.toString(bool));

        int [][] nums = new int [5][];
        System.out.println(Arrays.toString(nums));

        String [][] computers = {
                {"Hp", "Lenovo", "Toshiba"},
                {"Mac Pro", "Mac Air", "IBM"},
                {"Dell", "Asus", "Samsung", "Acer"}};

        for(int i = 0; i < computers.length; i++){
            System.out.println(Arrays.toString(computers[i]));
        }


    }
}
