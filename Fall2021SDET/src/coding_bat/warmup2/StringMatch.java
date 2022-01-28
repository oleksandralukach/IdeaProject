package coding_bat.warmup2;

/**
 * Given 2 strings, a and b,
 * return the number of the positions
 * where they contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3,
 * since the "xx", "aa", and "az" substrings
 * appear in the same place in both strings.
 * <p>
 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */
public class StringMatch {

    public int stringMatch(String a, String b) {

        int num = 0;
       // int len = Math.min(a.length(), b.length()); //will return the length of smaller string

        if (a.length() >= b.length()) {
            for (int i = 0; i < b.length() - 1; i++) {
                if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                    num++;
                }
            }
        }
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length()-1 ; i++) {
                if (b.substring(i, i + 2).equals(a.substring(i, i + 2))) {
                    num++;
                }
            }
        }

        return num;
    }
}
