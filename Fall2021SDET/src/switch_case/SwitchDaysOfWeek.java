package switch_case;

public class SwitchDaysOfWeek {

    public static void main(String[] args) {

        // switch (parameter) parameter can only be char byte, short, int, String, enum,
        // wrapper classes for primitive comparisons

       // double num = 12.34;

        String dayOfTheWeek = "Saturday";

        switch (dayOfTheWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");

        }
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }
}
