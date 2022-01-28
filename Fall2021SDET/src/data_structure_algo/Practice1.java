package data_structure_algo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Practice1 {
    public static void main(String[] args) {


        int[] nums = new int[9];
        nums[0] = 4;
        nums[1] = 1;

        int hello = nums.length;

        //array list
        ArrayList<Integer> k = new ArrayList<>();
        k.add(2, 7);
        System.out.println(k.indexOf(7));

        //linked list
        LinkedList<Integer> i = new LinkedList<>();
        i.add(9);
        i.add(89);
        i.add(17);
        i.removeFirst();

    }
}
