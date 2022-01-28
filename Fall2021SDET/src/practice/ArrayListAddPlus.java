package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAddPlus {

    public static void main(String[] args) {

        /*
        list items = {“aplha”, “beta”, “gamma”}
        expected output: {“alpha+“, “beta+“, “gamma+“}
         */
        List<String> items = Arrays.asList("alpha", "beta", "gamma");

        addPlusToElements(items);
    }

    public static List<String> addPlusToElements(List<String> items){

        int i = 0;
        //with enhanced loop
        for (String element : items) {
            items.set(i, element + "+");
            i++;
        }
        System.out.println(items);

        //with for loop:
//        for( i = 0; i < items.size(); i++){
//
//            items.set(i,items.get(i)+ "+");
//        }
//        System.out.println(items);

        return items;
    }
}
