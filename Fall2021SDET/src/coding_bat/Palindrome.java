package coding_bat;

public class Palindrome {
    static boolean isPalindrome(String str)
    {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length()-1; // beginning point and ending point

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        // Given string is a palindrome
        return true;
    }

    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";

        str = str.toLowerCase().replaceAll(" ", "");

        System.out.println(verifyPalindrome(str));
        System.out.println(isPalindrome(str));

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
        System.out.println();
        return str.equalsIgnoreCase(reversedStr);

    }
}
