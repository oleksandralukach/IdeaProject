package data_types;

public class EscapeSequences {
    public static void main(String[] args) {

        //It is used to escape special characters and print them as is.
        //A character preceded by a backslash (\) is an escape sequence and has a special meaning to the compiler.
        //they used for printing special characters

        String welcome = "Welcome to Google.";
        String ourHqrs = "This is the \"headquarters\" of our company!";
        // escape sequence for inserting double quotes within a text [string] \"
        // This \" escape sequence is for printing a double quotation mark on the text string
        System.out.println(welcome);
        System.out.println(ourHqrs);

        // inserting a new line within a String by using \n escape sequence
        String welcomeToHqrs = "Welcome to Google. \nThis is the \"headquarters\" of our company!";
        System.out.println(welcomeToHqrs);

        // to insert a tab in the text we can use \t escape sequence
        System.out.println("\tHello all, please meet Sundar Pichai.");

        // \r carriage return - reset a device's position to the beginning of a line of text
        System.out.println("Hello all, please meet \r Sundar Pichai.");

        // \' Single-quote (Needed to be used inside single-quoted char, i.e., '\'')

        // \\ Back-slash (Needed as back-slash is given a special meaning)

    }
}
