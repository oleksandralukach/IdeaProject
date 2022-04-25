package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySwitchThePlacesNumbers {
    public static void main(String[] args) {
        int[] a = {5, 9};
        int[] b = {4, 3};
        System.out.println("a[] before swapping : " + Arrays.toString(a));
        System.out.println("b[] before swapping : " + Arrays.toString(b));
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] - b[i];
            b[i] = a[i] + b[i];
            a[i] = GetAbsoluteValue(a[i] - b[i]);
        }
        System.out.println("a[] after swapping : " + Arrays.toString(a));
        System.out.println("b[] after swapping : " + Arrays.toString(b));

        //==================================

        //The swap() method of the Collections class swaps elements at the specified position
        // in the specified list. We convert our firstArr into a list using Arrays.asList()
        // and then pass it to the swap() method with positions 0 and 2.
        // It swaps the word at index 0 with the word at index 2.
        String [] firstArr = {"Hello","World","Happy","Coding"};
        System.out.println("first[] before swapping : "+Arrays.toString(firstArr));
        List<String> a2 = Arrays.asList(firstArr);
        Collections.swap(a2,0,2);

        System.out.println("first[] after swapping : "+Arrays.toString(firstArr));

    }

    public static int GetAbsoluteValue(int a) {
        return Math.abs(a);
    }


}
