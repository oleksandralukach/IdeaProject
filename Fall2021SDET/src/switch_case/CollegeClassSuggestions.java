package switch_case;

import java.util.Locale;
import java.util.Scanner;

public class CollegeClassSuggestions {
    public static void main(String[] args) {
        /* Tell students which classes they have to take.

What major are you in?
- accounting -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        -> year 3 and 4 -> Excel, Macro and Micro economics;
- Software eng -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        -> year 3 and 4 -> Java, Database, Cybersecurity;
- psychology -> year 1 and 2 should take Public speaking, Body languages;
          -> year 3 and 4 -> Psychology, Neuroscience;
 */
       Scanner input = new Scanner(System.in);
       System.out.println("Input your major: ");
       String major = input.nextLine().toLowerCase(Locale.ROOT);

       System.out.println("Input the year you are in: ");
       int year = input.nextInt();

       String course = "";

       switch (major){

           case "accounting":
               switch (year)
               {
                   case 1:
                   case 2:
                   course = "Math 1 and Math 2, Calculus";
                   break;

                   case 3:
                   case 4:
                       course = "Excel, Marco and Micro economics";
                       break;
                   default:
                       System.out.println("Enter years between 1 and 4 for accounting");
                       break;
               }
               break;
           case "Software eng":
               switch (year)
               {
                   case 1:
                   case 2:
                       course = "Math 1 and Math 2, Calculus";
                       break;

                   case 3:
                   case 4:
                       course = "Java, Database, Cybersecurity";
                       break;
                   default:
                       System.out.println("Enter years between 1 and 4 for engineering");
                       break;
               }
               break;
           case "psychology":
               switch (year)
               {
                   case 1:
                   case 2:
                       course = "Public speaking, Body languages";
                       break;

                   case 3:
                   case 4:
                       course = "Psychology, Neuroscience";
                       break;
                   default:
                       System.out.println("Enter years between 1 and 4 for psychology");
                       break;
               }
               break;
           default:
               System.out.println("Enter a course from following: accounting, software eng, psychology");
       }
    }
}
