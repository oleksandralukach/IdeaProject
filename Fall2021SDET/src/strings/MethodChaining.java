package strings;

import java.util.Locale;

public class MethodChaining {

    // method chaining is a process of calling one method after another but the rule
    // is to make sure that return type of the previous method is supported by the next method

    public static void main(String[] args) {

        String str = "Super Hello World";
        System.out.println(str);
        String original = str.substring(7, 9);
        System.out.println(original);

        String original1 = str.substring(6, 13).trim();
        System.out.println(original1);

        int x = -99;
        System.out.println(Math.abs(x));

        //============================================================

        String animal = " Zebra  ";
        String animalTrimmed = animal.trim();
        String animalUpperCase = animalTrimmed.toUpperCase();
        String animalCharReplaced = animal.replace ("Z", "J");

        System.out.println(animal);
        System.out.println(animalTrimmed);
        System.out.println(animalUpperCase);
        System.out.println(animalCharReplaced);

        String animalFinal = animal.trim().toUpperCase().replace("E", "A");
        //separate objects are being created when each method is applied

        System.out.println(animalFinal);

    }
    public boolean mixStart (String str){
        if(str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
}
