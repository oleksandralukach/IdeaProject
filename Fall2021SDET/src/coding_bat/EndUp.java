package coding_bat;

public class EndUp {

    public static void main(String[] args) {

        EndUp obj = new EndUp();

        String updatedStr = obj.endUp("flower");
        System.out.println(updatedStr);

    }

    public String endUp(String str) {

        String newStr = "";
        if (str.length() <= 3) {
            newStr = str.toUpperCase();
        } else {
            String last3Chars = str.substring(str.length() - 3);
            String last3CharsToUpperCase = last3Chars.toUpperCase();
            newStr = str.substring(0, str.length() - 3).concat(last3CharsToUpperCase);
        }

        return newStr;
    }
}
