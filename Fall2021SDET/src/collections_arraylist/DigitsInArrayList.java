package collections_arraylist;

import java.util.ArrayList;

public class DigitsInArrayList {
    public static void main(String[] args) {

        // write a method that takes ArrayList<String> as a parameter
        // and returns an Arraylist<Integer> with the numbers from given arraylist

        ArrayList<String> strList = new ArrayList<>(1);

        strList.add("Devx 56 School");
        strList.add("Yale 78 Garden");
        strList.add("Stanford 93 Fields");

        // Expected output: [5,6,7,8,9,3]

        System.out.println("Given arraylist of Strings: " + strList);

        System.out.println("The following digits were found: " + findNumber(strList));
    }

    public static ArrayList<Integer> findNumber(ArrayList<String> listOfStrings) {

        ArrayList<Integer> numberList = new ArrayList<>();

        // outer loop is used for iterating over the listOfStrings
        for (int i = 0; i < listOfStrings.size(); i++) {

            // tempString is pointing to the element from listOfStrings at index i
            String tempString = listOfStrings.get(i);

            // inner loop is used for iterating over each element[tempString] of the listOfStrings
            for (int j = 0; j < tempString.length(); j++) {

                // tempChar is used for storing character of tempString
                char tempChar = tempString.charAt(j);

                // public static boolean isDigit(char c) -> method takes char primitive as a parameter and checks whether the
                // char value is digit or not and if it's digit then it returns true
                if (Character.isDigit(tempChar))
                    numberList.add(Character.getNumericValue(tempChar));

                // public static int getNumericValue(char c) -> method returns an int value of a character
            }
        }

        return numberList;
    }
}
