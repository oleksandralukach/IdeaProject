package strings;

import java.util.Locale;

public class StringMethodPractice {

    // write a method that takes a String as a parameter and returns String all Uppercase
    // write a method that takes char as a parameter and string as parameter
    // and returns an int which is the index of that char from given string

    public static void main(String[] args) {

        String result = convertToUpperCase("hello");
        System.out.println(result);

        int index = findCharIndex('a', "New York");
        System.out.println(index);
    }

    public static String convertToUpperCase (String input){

        return input.toUpperCase();
    }

    public static int findCharIndex (char ch, String str){

        int index = str.indexOf(ch);
        return index;
    }
}
