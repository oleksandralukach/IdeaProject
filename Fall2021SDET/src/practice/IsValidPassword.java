package practice;

/**
 * Write a Java method to check whether a string is a valid password.
 * Password rules:
 * A password must have at least ten characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.
 * <p>
 * Input a password: devx2021
 * PW is Valid: devx2021
 */
public class IsValidPassword {

    public static void main(String[] args) {

        String passwordInput = "1234567890";

        IsValidPassword validPass = new IsValidPassword();
        validPass.isValidPassword(passwordInput);
    }

    public boolean isValidPassword(String password) {

        //1.A password must have at least ten characters.
        boolean isValidPasswordLength = password.length() >= 10;

        //2.A password consists of only letters and digits.
        boolean isDigitsAndLettersOnly = false;
        int countDigitsOrLetters = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)) || Character.isAlphabetic(password.charAt(i))) {
                countDigitsOrLetters++;
            }
            if(countDigitsOrLetters == password.length()){
                isDigitsAndLettersOnly = true;
            }
        }

        //3.A password must contain at least two digits.
        boolean has2Digits = false;
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
            if (countDigits >= 2) {
                has2Digits = true;
            }
        }

        if (isValidPasswordLength && isDigitsAndLettersOnly && has2Digits)
            System.out.println("PW is Valid: " + password);
        else System.out.println("PW is Invalid: " + password);

        return isValidPasswordLength && isDigitsAndLettersOnly && has2Digits;
    }
}

//    //3.A password must contain at least two digits.
//    boolean has2Digits = false;
//    int countDigits = 0;
//        for (int i = 0; i <= 9; i++) {
//                if (password.contains(String.valueOf(i))) {
//                countDigits++;
//                }
//                if (countDigits >= 2) {
//                has2Digits = true;
//                }
//                }