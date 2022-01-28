package coding_bat;

public class DeleteDelInString {
    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    public static String delDel(String str) {
//        if (str.contains("del")) {
//
//            if ((str.charAt(1) == 'd') && (str.charAt(2) == 'e') && (str.charAt(3) == 'l')) {
//                String deletedDel = str.substring(4,str.length());
//                str = str.charAt(0) + deletedDel;
//            }

        if (str.startsWith("del",1)) {
            String deletedDel = str.substring(4, str.length());
           str = str.charAt(0) + deletedDel;
        }
        return str;
    }


    public static void main(String[] args) {
        String str = "adelHello";
        String newStr = delDel(str);
        System.out.println(newStr);
    }
}
