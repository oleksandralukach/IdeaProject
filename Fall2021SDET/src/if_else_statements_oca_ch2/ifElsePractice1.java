package if_else_statements_oca_ch2;

import java.util.Scanner;

public class ifElsePractice1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String coat = "Put on a coat";
        String rainJacket = "Put on a rain jacket";
        String lightClothes = "Put on a light clothing";

        System.out.println("Is it raining outside?");
        boolean isRaining = scan.nextBoolean();

        System.out.println("What is temperature outside?");
        byte temp = scan.nextByte();

        if (isRaining && temp <=30) {
            System.out.println("Stay inside");
        } else if (isRaining && temp > 30 && temp <= 50) {
            System.out.println(coat);
        } else if (isRaining && temp > 50 && temp <= 70){
            System.out.println(rainJacket);
        } else if (isRaining && temp >= 71) {
            System.out.println(lightClothes);
        } else {
            System.out.println("Enjoy the weather");
        }
    }
}
