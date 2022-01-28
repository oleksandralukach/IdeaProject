package map;

import java.util.HashMap;
import java.util.Map;

// count occurrences of chars in string
public class NumberOccurrencesOfCharsInString {

    public static void main(String[] args) {
        String word = "Hello World";

        Map<Character, Integer> occurrences = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (!occurrences.containsKey(word.charAt(i))) { //if it doesn't contain a key
                occurrences.put(word.charAt(i), 1);
            } else {
                int valueLastOccurNumber = occurrences.get(word.charAt(i)); //get() take key and will return value
                occurrences.put(word.charAt(i), valueLastOccurNumber+1);
            }
        }

        System.out.println(occurrences);

//count occurrences
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == 'l') {
//                counter++;
//            }
//        }
//        System.out.println(counter);
    }
}
