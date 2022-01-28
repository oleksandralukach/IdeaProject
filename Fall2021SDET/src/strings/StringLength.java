package strings;

public class StringLength {
    // public int length() {}
    // returns the number[quantity] of characters in a String variable

    public static void main(String[] args) {

        String nameOfStudent = "Mansur";
        System.out.println("Number of chars in this string: " + nameOfStudent.length());

        int length = "devx".length();
        System.out.println(length);

        System.out.println("Maryna".length() + 5); // 11

        System.out.println(length + 4); // since .length() method returns an int, we can use it to perform
        // arithmetic operations

    }
}
