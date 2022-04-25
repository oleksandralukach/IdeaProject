package coding_bat.string_1;

public class Left2 {
    /*

Given a string, return a "rotated left 2"
version where the first 2 chars are moved to the end.
The string length will be at least 2.
     */

    public static void main(String[] args) {
        String str = "hello";

        System.out.println(left2(str));
    }
    public static String left2(String str) {

        String newStr = str.substring(2).concat(str.substring(0,2));

        return newStr;
    }

}
