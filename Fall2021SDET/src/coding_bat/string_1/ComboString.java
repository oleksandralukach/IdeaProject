package coding_bat.string_1;

public class ComboString {
    /**
     * Given 2 strings, a and b, return a string of the form short+long+short,
     * with the shorter string on the outside and the longer string on the inside.
     * The strings will not be the same length, but they may be empty (length 0).
     * <p>
     * <p>
     * comboString("Hello", "hi") → "hiHellohi"
     * comboString("hi", "Hello") → "hiHellohi"
     * comboString("aaa", "b") → "baaab"
     */

    public String comboString(String a, String b) {

        String newStr = "";

        if(a.length()>b.length()){
            newStr = b + a + b;
        }else{
            newStr = a + b + a;
        }

        return newStr;
    }
}
