package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayWithUserInput {
    public static void main(String[] args) {

        String [] domesticAnimals = {"Dog", "Cat", "Parrots", "Goat"};

        // to print out "Cat":
        System.out.println(domesticAnimals[1]);

        // save element of Array to String var:
        String catElement = domesticAnimals[1];
        System.out.println(catElement);

        // change "Cat" element in Array to "Kitty":
        String kittyElement = "Kitty";
        domesticAnimals[1] = kittyElement;

        // not possible to add more elements to Array that it has
        // index of out of bound exception
//        domesticAnimals[4] = "Tigers";
//        System.out.println(domesticAnimals[4]);

        // we can put var of elements
        String python = "Python";

        String[] wildAnimals = {"Eagle", python, "Tiger", "Anaconda", "Gorilla"};

        // print out each element in a line
        for(String animal : wildAnimals){
            System.out.println(animal);
            if(animal.equalsIgnoreCase("Python")){
                System.out.println("I have found python, so I will skip to the next animal");
                continue;
            }

            else if(animal.equalsIgnoreCase("Anaconda")){
                System.out.println("I have came across " + animal);
                break;
            }
        }
        Scanner scan = new Scanner (System.in);

        System.out.println("Please enter a number of animals you want to add: ");
        int numberOfAnimals = scan.nextInt();
        scan.nextLine();

        String[] zooAnimal = new String [numberOfAnimals];

        for (int i = 0; i < zooAnimal.length; i++){
            System.out.println("Please enter " + (zooAnimal.length-i) + " animals more");
            zooAnimal[i] = scan.nextLine();

        }

        // alternative:
        int counter = zooAnimal.length; // to show how many animals left to enter

        for (int i = 0; i < zooAnimal.length; i++){
            System.out.println("Please enter " + counter-- + " animals more");
            zooAnimal[i] = scan.nextLine();

        }

        System.out.println("Here are the animals in our zoo: " + Arrays.toString(zooAnimal));

    }
}
