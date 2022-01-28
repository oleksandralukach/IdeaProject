package practice;

import java.util.ArrayList;

public class MultiplesOf3And6 {
    /**
     * create a method that returns an ArrayList of integers
     * which are multiples of 3 and 6 from 0 to 200
     */
    public static void main(String[] args) {

        System.out.println(findingTheMultiples());

    }

    public static ArrayList<Integer> findingTheMultiples() {

        ArrayList<Integer> multiples = new ArrayList<>();

        for (int i = 0; i < 200; i++) {

            if (i % 6 == 0)
                multiples.add(i);
            if(i % 5 == 0)
                continue;
        }

        return multiples;
    }

}

