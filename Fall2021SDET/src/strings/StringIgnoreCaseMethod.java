package strings;

public class StringIgnoreCaseMethod {

    // public boolean equalsIgnoreCase (String str)
    // returns true when the cases are different, ignoring case considerations.

    public static void main(String[] args) {

        System.out.println("Alex".equalsIgnoreCase("alex"));

        String school1 = "Princeton";
        String school = "princeton";

        System.out.println(school.equalsIgnoreCase(school1));
    }
}
