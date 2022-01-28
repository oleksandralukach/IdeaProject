package homework_assignments;

public class StringConcat {

    /*
    Given a string, return a version without the first and last char, so "Hello" yields "ell".
    The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
     */

    public static void main(String[] args) {

        String givenString = "Home";
        createNewStr(givenString);

    }

    public static String createNewStr(String str) {

        String newStr = str.substring(str.indexOf(str.charAt(1)), str.length() - 1);

        if (str.length() > 2) {
            System.out.println("Without first and last char \"" + str + "\" is " + "\"" + newStr + "\"");
        } else
            System.out.println("Please input String with more than 2 characters");

        return newStr;
    }
}
