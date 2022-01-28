package strings;

public class SubStringMethod {

    //public String Substring (int index) -> returns part of the String
    // starting and including character
    // from index to the end of the String variable

    public static void main(String[] args) {

        String subS = "Devx".substring(1); // evx
        String subS2 = "Devx".substring(2); // vx

        System.out.println(subS);
        System.out.println(subS2);
    }


}
