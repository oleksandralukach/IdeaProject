package Lambda;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lambda {

    public static void main(String[] args) {

        //cache memory - stores temp information within one program run
        // Info stored only during program run. It gets deleted when program stops
        // Cache memory - the fastest memory to access
        //collections usually referred to as Cache Memory

        Set<String> plateNums = new HashSet<>();

        Scanner scan = new Scanner(System.in);
        // Ask a DMV agent to enter a new plateNum

        for (int i = 0; i < 5; i++) {
            System.out.println("Add a new plate Number");
            // check if it exists in a set:
            if (!plateNums.add(scan.nextLine())) { // add method returns true if set doesn't contain this element
                System.out.println("The plate number is taken");
            }
        }
        //write a logic to print out "IL1234" if it exists in the set
// looping if element is equal to the one we are looking. If it is - print it
        for (String element : plateNums) {
            if (element.equals("IL1234")) {
                System.out.println(element);
            }
        }

        // printing out every single element in a new line:
        // lambda and streams
        // Collections: List, Set
        plateNums.forEach(System.out::println);
    }
}
