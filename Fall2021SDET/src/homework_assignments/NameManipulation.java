package homework_assignments;

import java.util.Locale;

public class NameManipulation {

    public static void main(String[] args) {


        /**
         * Write a program that prints as a below example output using methods
         *
         *
         * Full name is leo messi
         * Initials are LM
         * First name is Leo
         * Last name is Messi
         */
        NameManipulation nameManipulation = new NameManipulation();
        String fullName = "leo messi";

        System.out.println("Full name is " + nameManipulation.convertFirstLetterOfNameAndLastNameToUppercase(fullName));

        String initials = nameManipulation.getInitials(fullName);
        System.out.println("Initials are " + initials);

        String firstName = nameManipulation.getFirstNameFrom(fullName);
        System.out.println("First name is " + firstName);

        String lastName = nameManipulation.getLastNameFrom(fullName);
        System.out.println("Last name is " + lastName);

    }

    /**
     * Write a function that converts first letter of first name and last name to Uppercase
     *
     * @param fullName
     * @return String
     */
    public String convertFirstLetterOfNameAndLastNameToUppercase(String fullName) {

        int whiteSpaceIndex = fullName.indexOf(" ");
        String firstName = fullName.substring(0, 1).toUpperCase() + fullName.substring(1, whiteSpaceIndex);
        String lastName = fullName.substring(whiteSpaceIndex + 1, whiteSpaceIndex + 2).toUpperCase() +
                fullName.substring(whiteSpaceIndex + 2);

        String result = firstName + " " + lastName;

        return result;
    }

    /**
     * Write a function that gets initials from full name
     *
     * @param fullName
     * @return String
     */
    public String getInitials(String fullName) {

        int whiteSpaceIndex = fullName.indexOf(" ");
        String convertedName = convertFirstLetterOfNameAndLastNameToUppercase(fullName); // Leo Messi
        String initialFirstName = convertedName.substring(0, 1);
        String initialLastName = convertedName.substring(whiteSpaceIndex + 1, whiteSpaceIndex + 2);

        String result = initialFirstName + initialLastName;

        return result;
    }

    /**
     * Write a function that gets first name from full name
     *
     * @param fullName
     * @return String
     */
    public String getFirstNameFrom(String fullName) {

        int whiteSpaceIndex = fullName.indexOf(" ");

        String convertedName = convertFirstLetterOfNameAndLastNameToUppercase(fullName); // Leo Messi
        String firstName = convertedName.substring(0, whiteSpaceIndex);

        return firstName;
    }

    /**
     * Write a function that gets last name from full name
     *
     * @param fullName
     * @return String
     */
    public String getLastNameFrom(String fullName) {

        int whiteSpaceIndex = fullName.indexOf(" ");

        String convertedName = convertFirstLetterOfNameAndLastNameToUppercase(fullName); // Leo Messi
        String lastName = convertedName.substring(whiteSpaceIndex + 1);

        return lastName;
    }

}

