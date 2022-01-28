package collections_arraylist;

import java.util.ArrayList;
import java.util.List;

public class AutoUnBoxingVsAutoBoxing {

    // Boxing -> converting primitive to Wrapper Object manually
    // Autoboxing -> converting primitive to Wrapper Object type automatically java handles it

    // Unboxing -> converting Wrapper object to primitive type
    // AutoUnboxing -> converting Wrapper Object to primitive

    public static void main(String[] args) {

        // Boxing
        int i = 77;

        Integer iObject = Integer.valueOf(i); //

        // Autoboxing

        int age = 67;

        Integer ageObject = age;

        // Unboxing

        Character cObject = new Character('h');

        //char cPrimitive = cObject.charValue();

       char cPrimitive = Character.valueOf(cObject);
        System.out.println(cPrimitive);

        // Auto unboxing

        Double temp = 87.45;

        double tempPrimitive = temp;

        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        System.out.println(heights);
        heights.get(0);
        System.out.println(heights.size());
        //System.out.println(heights.get(0));
        String h = heights.get(0).toString();
       // System.out.println(heights);
        //System.out.println(h);

        //converting from String to int by parseInt()
        String year = "123";
        int yearInt = Integer.parseInt(year);

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");


    }
}

