package coding_bat.string_1;

public class FirstHalf {
    /**
     * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     * <p>
     * firstHalf("WooHoo") → "Woo"
     * firstHalf("HelloThere") → "Hello"
     * firstHalf("abcdef") → "abc"
     */

    public String firstHalf(String str) {

        String firstHalf = str.substring(0, str.length()/2);

        return firstHalf;
    }

}
