package methods;

public class Print_Void_Method {

    public static void main(String[] args) {

        // System.out.println("Hello!");

        // to call the method simply type the name of the method if its static
        // and put parentheses at the end and put semicolon

        printHello(); //method call
    }

    //static - optional specifier makes this method accessible from other methods
    //by just calling its name

    public static void printHello() {
        System.out.println("Hello!");
    }

}
