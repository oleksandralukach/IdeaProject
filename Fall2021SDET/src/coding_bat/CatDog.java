package coding_bat;

public class CatDog {
    /*
Return true if the string "cat" and "dog"
appear the same number of times in the given string.
     */

    public static void main(String[] args) {

        System.out.println(catDog("catxdogxdogxca"));

    }

    public static boolean catDog(String str) {

        int i = 0;

        boolean result = true;
        int countcat = 0;
        int countdog = 0;

        if (str.length() >= 3) {

            while (i < str.length()) {

                if (str.charAt(i) == 'c' &&
                        str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                    countcat += 1;
                }

                if (str.charAt(i) == 'd' &&
                        str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                    countdog += 1;
                }

                if (countcat == countdog) {
                    result = true;
                } else
                    result = false;

                i++;
            }

        }
        else {
            result = true;
        }
        return result;
    }
}