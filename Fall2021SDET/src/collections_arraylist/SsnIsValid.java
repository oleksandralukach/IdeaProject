package collections_arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SsnIsValid {

    //check if ssn is Valid
    public static void main(String[] args) {

        List<String> ssn = new ArrayList<>();
        ssn.add("123-45-6789");
        ssn.add("123-45-6785");
        ssn.add("123-45-6783");

       // print all elements:
        for(int i = 0; i < ssn.size(); i++){
            String ssnElement = ssn.get(i);
            System.out.println(ssnElement);
        }

        // print element with invalid format(using method we created):
        for(int i = 0; i < ssn.size(); i++){
           if(!checkFormat(ssn.get(i))){
               System.out.println(ssn.get(i)+ " has invalid format");
           }
        }


    }

    public static boolean checkFormat(String socialSN){
        boolean first3Digits = Character.isDigit(socialSN.charAt(0)) &&
                Character.isDigit(socialSN.charAt(1)) &&
                Character.isDigit(socialSN.charAt(2));
        boolean char4isAHiphen = socialSN.charAt(3) == '-';
        boolean char5And6AreDigits = Character.isDigit(socialSN.charAt(4)) &&
                Character.isDigit(socialSN.charAt(5));
        boolean char6isAHiphen = socialSN.charAt(6) == '-';
        boolean lastFourAreDigits = Character.isDigit(socialSN.charAt(7)) &&
                Character.isDigit(socialSN.charAt(8)) &&
                Character.isDigit(socialSN.charAt(9)) &&
                Character.isDigit(socialSN.charAt(10));
        return first3Digits && char4isAHiphen && char5And6AreDigits && char6isAHiphen && lastFourAreDigits;



    }
}
