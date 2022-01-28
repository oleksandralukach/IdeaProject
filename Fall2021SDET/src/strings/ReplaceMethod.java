package strings;

public class ReplaceMethod {

    // public String replace (String s1, String s2) or replace(char c1, char c2)
    // returns a string by replacing all occurrences
    // of first parameter with the second param from given String

    public static void main(String[] args) {

        String str = "feeksforfeeks";
        System.out.println(str);
        System.out.println(str.replace('f', 'g'));

        String str2 = str.replace("feeks", "geeks");
        System.out.println(str2);
    }
}
