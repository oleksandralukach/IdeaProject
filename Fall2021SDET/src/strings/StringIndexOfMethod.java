package strings;

public class StringIndexOfMethod {
    // public int index (String str)
    // indexOf() returns the index of a String from a given string
    // it starts from index 0 and looks for the string we are searching for


    // public int index (String str, int index)
    // returns the index of the specific string from given string starting from specified index

    public static void main(String[] args) {

        System.out.println("Mansur".indexOf("n"));
        // from given string "Mansur" the index of "n" is 2

        int indexOfN = "Aleksandra".indexOf("n");
        System.out.println(indexOfN);

        // ===========================================================

        int indexOfE = "Daniel Sellers".indexOf("e",5);
        System.out.println(indexOfE);

    }
}
