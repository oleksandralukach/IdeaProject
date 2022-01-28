package practice;

import java.util.ArrayList;

public class ArrayListOfEvenNumbers {
    /*
    Write a method that returns an arraylist of even numbers from 1 to 100.
     */
    public static void main(String[] args) {
        returnEvenNumbers();

    }
    public static ArrayList<Integer> returnEvenNumbers(){

        ArrayList<Integer>numbers = new ArrayList<>();
        for (int i = 0; i<=100; i++)

            if (i % 2 == 0) {
                numbers.add(i);
            }
        System.out.println(numbers);
        return numbers;
    }
}
