package coding_bat.string_1;

public class NonStart {
    /**
     * Given 2 strings, return their concatenation,
     * except omit the first char of each.
     * The strings will be at least length 1.
     *
     *
     * nonStart("Hello", "There") → "ellohere"
     * nonStart("java", "code") → "avaode"
     * nonStart("shotl", "java") → "hotlava"
     */
    public String nonStart(String a, String b) {

        String newStr = a.substring(1,a.length()) + b.substring(1,b.length());
        return newStr;
    }
}
