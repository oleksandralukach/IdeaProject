package strings;

public class TrimMethod {

    // public String trim()
    // returns a string by removing whitespaces from both ends
    // removes \t, \r, \s

    // since String is an immutable any method we call on strings
    // won't change the object, it will instead create new objects each and every time.

    public static void main(String[] args) {

        String schoolName = "   DevX school";
        System.out.println(schoolName.trim());
        System.out.println(schoolName);

        schoolName = schoolName.trim();
        System.out.println(schoolName);
    }
}
