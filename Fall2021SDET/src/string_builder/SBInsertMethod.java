package string_builder;

public class SBInsertMethod {

    // insert (int offset [index], String str)
    // returns the reference to the same object by adding String at certain position

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Devx");
        sb.insert (sb.length(), " School");
        System.out.println(sb);

        sb.insert(sb.indexOf(" "), "IT");
        System.out.println(sb);
    }
}
