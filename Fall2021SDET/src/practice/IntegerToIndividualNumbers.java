package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a Java program to break an integer into a sequence of individual digits.
 * Input: 12345
 * Expected Output : 1 2 3 4 5
 */
public class IntegerToIndividualNumbers {

    public static void main(String[] args) {
        int number = 12345;

        IntegerToIndividualNumbers obj = new IntegerToIndividualNumbers();
        System.out.println(obj.breakIntegerToDigits(number));
    }

    public List<Integer> breakIntegerToDigits (int numberInt){

        List<Integer> individualDigits = new ArrayList<>();
        String numberSrt = Integer.toString(numberInt);

        for (int i = 0; i < numberSrt.length(); i++) {
            individualDigits.add(Character.getNumericValue(numberSrt.charAt(i)));
        }

        return individualDigits;
    }
}


