package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Write your Checker class here
class Checker implements Comparator<Player>{

    public int compare(Player a, Player b) {
        // If 2 Players have the same score
        if(a.score == b.score){
            // Order alphabetically by name
            return a.name.compareTo(b.name);
        }

        // Otherwise, order higher score first
        return ((Integer) b.score).compareTo(a.score);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //amount of players

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt()); //constructor will initialize instances for every player)
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

