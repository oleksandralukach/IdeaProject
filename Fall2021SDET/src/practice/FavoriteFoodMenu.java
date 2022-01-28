package practice;

import java.util.Locale;
import java.util.Scanner;

public class FavoriteFoodMenu {
    public static void main(String[] args) {
        String[] menu = {"Teriyaki", "Fried Chicken Tempura", "California Roll", "Crunchy Tuna Roll",
                "Spring Roll", "Pad Thai", "Spicy Noodle", "Sake Nigiri", "Green Salad", "Tomyum soup"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your desired food");
        String desiredMenu = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < menu.length; i++) {
            if(menu[i].equalsIgnoreCase(desiredMenu)) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Great selection! " + desiredMenu + " in the menu this week! ");
        } else
        {
            System.out.println("Sorry, we don`t have " + desiredMenu + " in this week. Please provide another input.");
        }

    }

}

