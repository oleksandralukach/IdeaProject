package methods;

import java.util.Scanner;

public class WalkingDogWithMethod {
    public static void main(String[] args) {

        String morning = "Time for morning walk";
        String afternoon = "Time for afternoon walk";
        String lunch = "Time for lunch walk";
        String evening = "Time for evening walk";

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the time in military time");
        short t = scan.nextShort();

        if (t >= 700 && t <= 800) {
            walkTheDog(morning);

        } else if (t >= 1200 && t <= 1300) {
            walkTheDog(afternoon);

        } else if (t >= 1500 && t <= 1600) {
          walkTheDog(lunch);

        } else if (t >= 1900 && t <= 2100) {
            walkTheDog(evening);

        }
    }

    public static void walkTheDog (String timeOfDay){
        String morning = "Time for morning walk";
        String afternoon = "Time for afternoon walk";
        String lunch = "Time for lunch walk";
        String evening = "Time for evening walk";

        String timeToDress = timeOfDay + " walk\n" +
                "1. put on a jacket\n" +
                "2. put on a hat\n " +
                "3. put on a scarf [optional]\n " +
                "4. wear winter shoes\n " +
                "5. wear glove\n " +
                "6. dress your dog with warm clothes";

        System.out.println(timeToDress);
    }
}
