package strings;

public class StringConcatenation {

    public static void main(String[] args) {

        // String concatenation is simply adding another string to the end of an existing string variable
        String nameOfSchool = "Devx";
        String nameOfITSchool = "Devx";
        System.out.println(nameOfSchool + "School"); // DevxSchool
        System.out.println(nameOfSchool); // Devx

        nameOfSchool = "Yale"; // JVM has created a new object in string pool [aka intern pool]

        System.out.println(nameOfSchool);

        System.out.println(1 + 2 + ""); // 3 as a String

        System.out.println(nameOfITSchool = nameOfSchool + nameOfITSchool); // YaleDevx
        System.out.println(nameOfSchool = nameOfITSchool + nameOfSchool + nameOfITSchool); // YaleDevxYaleYaleDevx

        System.out.println(nameOfITSchool += " Great!"); // YaleDevx Great! -> nameOfITSchool = nameOfITSchool + " Great!";
        // compound assignment [operator]

        // public String concat(String str) -> is a method that concatenates another string
        // to the end of first String

        // concat(str) method always concatenates String argument to the end of given String
        // It can only take one parameter

        String studentName = "Maryna";
        String studentSchool = "Devx";
        String progLang = "Java";
        int studentId = 2;

        String text = studentName.concat(" loves " + progLang + " and " + studentName + "! Student ID: " + studentId);
        System.out.println(text);

        String spaceX = "Falcon";
        String teslaModel = "Model X";

        System.out.println(spaceX.concat(teslaModel));

    }
}
