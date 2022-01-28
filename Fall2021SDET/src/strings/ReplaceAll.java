package strings;

public class ReplaceAll {

    public static void main(String[] args) {
        String str = "Devx Devx";
        System.out.println(str.replaceFirst("vx", "vv")); // first occurrence
        System.out.println(str.replace("vx", "vv")); // all occurrences
        System.out.println(str.replaceAll("vx", "vv")); // all occurrences of String ?

        System.out.println(str.isEmpty());
    }
}
