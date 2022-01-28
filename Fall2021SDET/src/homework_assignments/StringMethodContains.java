package homework_assignments;

public class StringMethodContains {

    /*
    Write a Java program to verify if an inputted string contains the specified sequence of char.
Example Output:
String: DevX School coding task
Word to find: task
true
     */

    public static void main(String[] args) {

        String text = "DevX School coding task";

        System.out.println(text.contains("task"));

//        String sub = text.substring(text.indexOf("t"), text.length());
//        boolean result = sub.equals("task");
//        System.out.println(result);
    }
}
