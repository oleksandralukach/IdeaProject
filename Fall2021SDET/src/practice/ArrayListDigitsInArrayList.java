package practice;

import java.util.ArrayList;

public class ArrayListDigitsInArrayList {

    // write a method that takes ArrayList<String> as a parameter
    // and returns an ArrayList<Integer> with the numbers from given arraylist

    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();

        strList.add("Devx 56 School"); //0
        strList.add("Yale 78 Garden"); //1
        strList.add("Stanford 93 Fields"); //2

        System.out.println("Given ArrayList:" + strList);
        System.out.println("The following digits were found: " + findNumber(strList));

    }
    public static ArrayList<Integer> findNumber(ArrayList<String> listOfString){

        ArrayList<Integer> numberList = new ArrayList<>();

        // outer loop is used for iterating over the listOfStrings
        for (int i = 0; i < listOfString.size(); i++){

            // tempString is pointing to the element from listOfString at index i as "Devx 56 School"
            String tempString = listOfString.get(i); // get method to get element from ArrayList

            // inner loop is used for iterating over each element[tempString] of the listOfString
            for(int j = 0; j < tempString.length();j++){

                // tempChar is used for storing character of tempString
                char tempChar = tempString.charAt(j);

                if(Character.isDigit(tempChar)){
                    numberList.add(Character.getNumericValue(tempChar));
                }
            }
        }
        return numberList;
    }
}
