package homework_assignments;

public class TimeModulatorMath {

    public static void main(String[] args) {
        // you have huge number of seconds and you need to get how many days
        // hours and minutes and seconds
        // this is how you will do it

        int seconds = 864_005;
        // 86400 seconds in 1 day. 3600 seconds in 1 hour

        System.out.println("Days equal to: " + seconds/86_400);

        seconds = seconds % 86400;
        int hours = seconds/3600;
        System.out.println("Hours are: " + hours);

        int seconds1LeftOver = seconds % 86_400;
        System.out.println("Leftover seconds equal: " + seconds1LeftOver);

        int day = seconds/86_400;

        seconds = 4_567_899;

        seconds = seconds % 3600;

        System.out.println("this --> " + seconds);

    }
}
