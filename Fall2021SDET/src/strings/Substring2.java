package strings;

public class Substring2 {

    public static void main(String[] args) {

        String sub1 = "Devx".substring(0, 2);
        System.out.println(sub1);

        String sub2 = "Stanford".substring(2, 5);
        System.out.println(sub2);

        // String is immutable. It doesn't change the name, but just printing out

        String name = "Elon Musk";

        name = name.substring(5);
        System.out.println(name);

        //======================================================================

        String str = "| timezone | start-time 10:22:001 | end-time 10:23:234 |";

        int indexOfFirstColon = str.indexOf(':');
        int in = str.indexOf(" ", indexOfFirstColon); // found " " and count from indexOfFirstColon

        String startTime = str.substring(indexOfFirstColon -2, str.indexOf(" ", indexOfFirstColon));

        // other way:
        String startTime2 = str.substring(indexOfFirstColon -2, indexOfFirstColon + 7);

        System.out.println("Start time1: " + startTime);
        System.out.println("Start time2: " + startTime2);

        String endTime = str.substring(str.length() -11, str.length()-2);

        System.out.println("End time: " + endTime);

    }
}
