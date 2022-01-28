package methods;

import java.util.Scanner;

public class Walking_A_Dog_Using_One_String_Variable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the time in military time");
        short t = scan.nextShort();

        String morning = "Time for morning walk";
        String afternoon = "Time for afternoon walk";
        String lunch = "Time for lunch walk";
        String evening = "Time for evening walk";

        String timeToDress ="1. put on a jacket\n" +
                "2. put on a hat " +
                "3. put on a scarf [optional] " +
                "4. wear winter shoes " +
                "5. wear glove " +
                "6. dress your dog with warm clothes";

        if (t >= 700 && t <= 800) {
            System.out.println(morning + timeToDress);
        } else if (t >= 1200 && t <= 1300) {
            System.out.println(lunch + timeToDress);
        } else if (t >= 1500 && t <= 1600) {
            System.out.println(afternoon + timeToDress);
        } else if (t >= 1900 && t <= 2100) {
            System.out.println(evening + timeToDress);
        }
    }
}
