package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountAllLettersInString {
    public static void main(String[] args) {
        String str = "1Alex2";
        System.out.println(countLettersInString(str));
        countLettersInStringByCreatingMap("Alexandra Lukach");
    }

    public static int countLettersInString(String str) {

        int sum = 0;
        for (int i = 0; i < str.length(); i++) { //check if it is a letter by ASCII table
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122)
                sum++;
        }

        return sum;
    }

    public static void countLettersInStringByCreatingMap(String str) {

        if(str.contains(" ")){
            str = str.replace(" ", "");
        }

        Map< Integer, Character> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(i+1, str.charAt(i));
        }
        System.out.println(map.toString());
    }

}

