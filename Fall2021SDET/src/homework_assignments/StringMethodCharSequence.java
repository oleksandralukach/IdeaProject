package homework_assignments;

public class StringMethodCharSequence {

    /*
    Write a Java program to verify if an inputted string contains the specified sequence of char.
Example Output:
String: DevX School coding task
Word to find: task
true
     */

    public static void main(String[] args) {
        String inputtedStr = "DevX School coding task";
        String wordToFind = "task";
        boolean result = isContains(inputtedStr, wordToFind);
        System.out.println("String: " + inputtedStr +
                "\nWord to find: " + wordToFind);
        System.out.println(result);
    }

    public static boolean isContains (String str, String strToFind){

        boolean isContainsChars = str.contains(strToFind);
        return isContainsChars;
    }
}
