package methods;

import java.util.Scanner;

public class Walking_A_Dog_Using_If_Else {
    public static void main(String[] args) {

        // you have to walk you dog outside few times a day
        // if it's a winter time

        // morning walk 07:00 to 08:00
        // lunch walk 12:00 to 13:00
        // afternoon walk 15:00 to 16:00
        // evening walk 19:00 to 21:00

        // 1. put on a jacket
        // 2. put on a hat
        // 3. put on a scarf [optional]
        // 4. wear winter shoes
        // 5. wear glove
        // 6. dress your dog with warm clothes

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the time in military time");
        short t = scan.nextShort();

        if (t >= 700 && t <= 800) {
            System.out.println("1. put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear glove");
            System.out.println("6. dress your dog with warm clothes");
        } else if (t >= 1200 && t <= 1300) {
            System.out.println("1. put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear glove");
            System.out.println("6. dress your dog with warm clothes");
        } else if (t >= 1500 && t <= 1600) {
            System.out.println("1. put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear glove");
            System.out.println("6. dress your dog with warm clothes");

        } else if (t >= 1900 && t <= 2100) {
            System.out.println("1. put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear glove");
            System.out.println("6. dress your dog with warm clothes");

        }
    }
}
