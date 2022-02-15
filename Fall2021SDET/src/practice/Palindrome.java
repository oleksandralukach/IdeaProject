package practice;

public class Palindrome {

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        str = str.toLowerCase().replaceAll(" ", "");

        System.out.println(verifyPalindrome(str));
        System.out.println(isPalindrome(str));
        System.out.println(reverseStr(str).equals(str));

        // using for loop:
//        String reversedStr = "";
//
//        for (int index = str.length()-1; index >= 0; index--) {
//            reversedStr += str.charAt(index);
//        }
//
//        System.out.println(reversedStr);
//
//        System.out.println(str.equalsIgnoreCase(reversedStr));

    }
    // using while loop:

    public static boolean verifyPalindrome(String str) {
        String reversedStr = "";
        int i = str.length() - 1;

        while (i >= 0) {
            reversedStr += str.charAt(i);
            i--; // to go in reverse
        }
        return str.equalsIgnoreCase(reversedStr);

    }

    static boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
//        int i = 0, j = str.length() - 1; // beginning point and ending point
//
//        // While there are characters to compare
//        while (i < j) {
//            // If there is a mismatch
//            if (str.charAt(i) != str.charAt(j))
//                return false;
//            // Increment first pointer and
//            // decrement the other
//            i++;
//            j--;
//        }

        //same but for loop
        for (int k = 0, m = str.length()-1;k < m; k++, m--) {
            if (str.charAt(k) != str.charAt(m)){
                return false;
            }
        }
        // Given string is a palindrome
        return true;
    }

    //using stringBuilder:
    public static String reverseStr(String str) {
        StringBuilder sb1 = new StringBuilder(str);
        sb1.reverse();
        return sb1.toString();
    }

}
