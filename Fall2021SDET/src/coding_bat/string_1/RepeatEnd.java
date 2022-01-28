package coding_bat.string_1;

public class RepeatEnd {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 3;
        RepeatEnd repeatEndO = new RepeatEnd();
        String newStr = repeatEndO.repeatEnd(str,n);
        System.out.println(newStr);
    }

    public String repeatEnd(String str, int n) {
        str = str.substring(str.length() - 3); //llo
        String newStr = "";

        for (int i = 1; i <= n; i++) {
            newStr += str;
        }

        return newStr;
    }
}
