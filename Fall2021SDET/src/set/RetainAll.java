package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RetainAll {

    //add matching elements
    //Select players which have been chosen by both players
    public static void main(String[] args) {
        Set<String> player1Selection = new HashSet<>(Arrays.asList("Elon", "Jane"));
        Set<String> player2Selection = new HashSet<>(Arrays.asList("Elon", "Jane", "Mark", "Bill"));

        player2Selection.retainAll(player1Selection);
        System.out.println(player2Selection);


    }
}
