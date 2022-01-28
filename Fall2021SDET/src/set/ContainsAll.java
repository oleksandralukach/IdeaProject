package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsAll {

    // given a listOfSpeakers and a listOfRegistered
    // make sure all the registrants are present in the list of speakers
    // containsAll -> true/ false

    public static void main(String[] args) {

        Set<String> listOfSpeakers = new HashSet<>(Arrays.asList("Elon", "Marry", "Jane"));
        Set<String> listOfRegistrants = new HashSet<>(Arrays.asList("Elon", "Jane"));

        if(listOfSpeakers.containsAll(listOfRegistrants)){
            System.out.println("Let them all in");
        } else {
            System.out.println("Someone is trying to break in");
        }



    }
}
