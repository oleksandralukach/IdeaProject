package string_builder;

public class WithDifferentDataType {

    // StringBuilder append() method can take different primitive and non-primitive data types
    // as a parameter and convert them to StringBuilder and manipulate them

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb);

        sb.append('&')
                .append(123)
                .append(false)
                .append('c')
                .append("-");

        System.out.println(sb);

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one == two); // false
        System.out.println(one == three); // true

    }
}
