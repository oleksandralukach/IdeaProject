package arrays;

import java.util.Arrays;

public class ArraysWithStringsUseNestedLoop {

    public static void main(String[] args) {

        String[] cities = {"Chicago", "Seattle", "San Francisco", "New York", "Austin", "Auckland"}; // length 5
        // return index of 'a' from each element
        // and assign it to different array [indicesOfCharA]

        int[] indicesOfCharA = new int[cities.length]; // 6

        for (int i = 0; i < cities.length; i++) {

            indicesOfCharA [i] = cities[i].toLowerCase().indexOf('a');
        }

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(indicesOfCharA));
    }
}
