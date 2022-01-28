package practice;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayCommonElements {
    /*
    Write a Java program to find
    the common elements between two arrays (string values)
     */
    public static void main(String[] args) {

        String[] str1 = {"No", "Yes", "Hello", "World"};
        String[] str2 = {"Hello", "World"};


//        for (int i = 0; i < str1.length; i++) {
//
//            for (int j = 0; j < str2.length; j++) {
//                if (str1[i].equals(str2[j])) {
//                    System.out.println(str1[i]);
//                }
//            }
//        }
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str1[i].contains(str2[j])) {
                    System.out.println(str1[j]); // no yes
                }
            }
        }

        

    }
}
