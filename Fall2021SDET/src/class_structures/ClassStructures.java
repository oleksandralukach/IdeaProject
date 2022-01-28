package class_structures;

public class ClassStructures {
    public static void main(String[] args) {
        /*
        1. What are classes in java?
        Classes are the basic building blocks.
        A Class is like an object constructor, or a prototype, "blueprint" for creating objects.
        Class in Java determines how an object will behave and what the object will contain.
    - all classes in Java must be in a package. first package needs to be created and then create a class inside it;
    - syntax to create a class first it should have an access modifier EX: public
    - class keyword and then class name
    - class name should follow CamelCase naming convention [ standard ]

    2. How many main can there be in a class?
    - only one main method

    3. What is a main method?
    Method - a sequence of statements, group of statements.The braces{} enclose the body of the method, which contains statements.
    - public static void main(String [] args){}

    4. What are identifiers in java?
    - name given to package, variables, class, methods. It allows to refer to the item from other places in the program.

    5. System.out.print() vs System.out.println()
    - System.out.print() prints out the output in the console on the same line
    - System.out.println() prints out the output in the console on a new line

    6. Reserved keywords in java?
    - there are 53 words in java you cannot use as identifier.
    EX: public, class, boolean and some more words.
         */

        System.out.print("Hello World!");
        System.out.println("Welcome to your first class!");
        // My first comment
        // Below new line is being printed

        System.out.println("We are covering class structure today!");
        // System.err.print will get printed in console in red color
        System.err.print("You need to practice!");
        System.err.println();
        System.err.println("Practice makes it perfect!");
        /*
        This is a multiple line comment. I can input without
        using single lines
         */

    }
}
