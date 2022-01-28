package strings;

public class StringIndexing {

    public static void main(String[] args) {

        // indexing is basically a position that gets stored at certain index in String objects
        // Devx:
        //      'D' -> index [0]
        //      'e' -> index [1]
        //      'v' -> index [2]
        //      'x' -> index [3]

        // every special character can be a char in a String
        // and white spaces in String variables are also indexed because
        // every char "" that's in between double quotes is a String char

        String school = "Devx School"; // white space between Devx and School is also indexed

        System.out.println("Number of chars in a String: " + school.length());

        int nameLength = "mansur".length();
        System.out.println(nameLength);

    }
}
