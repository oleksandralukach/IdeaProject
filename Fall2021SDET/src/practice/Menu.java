package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Map<String, Double> menu = new HashMap<>(); // or = Map.of(initialize here);
    private static final Map<String, Double> bill = new HashMap<>();
    private static final Scanner scan = new Scanner(System.in);
    private static final String WHAT_WOULD_YOU_LIKE_TO_ORDER = "What would you like to order?";
    private static final String WOULD_YOU_LIKE_TO_ADD_MORE =
            "Would you like to add more item? Enter 'Yes' or 'No'";
    private static final String WHAT_WOULD_YOU_LIKE_TO_ADD = "What would you like to add? ";

    static {
        menu.put("Teriyaki", 10.98);
        menu.put("Fried Chicken Tempura", 8.99);
        menu.put("California Roll", 5.79);
        menu.put("Crunchy Tuna Roll", 4.79);
        menu.put("Spring Roll", 4.79);
        menu.put("Pad Thai", 9.98);
        menu.put("Spicy Noodle", 8.98);
        menu.put("Sake Nigiri", 7.35);
        menu.put("Green Salad", 6.78);
        menu.put("Tomyum soup", 8.99);
    }

    public static void main(String[] args) {
    /*
        As a user I want to order foods from restaurant and see ordered foods with prices.
    Test Data:

    Foods with prices: {“Teriyaki, 10.98”, “Fried Chicken Tempura, 8.99”, “California Roll, 5.79”,
    “Crunchy Tuna Roll, 4.79”, “Spring Roll, 4.79”, “Pad Thai, 9.98”, “Spicy Noodle, 8.98”,
    “Sake Nigiri, 7.35”, “Green Salad, 6.78”, “Tomyum soup, 8.99”}

    Please, use [ Map and loop ] in your code.

    Example:  output: Menu:
    "Teriyaki -> 10.98",
    "Fried Chicken Tempura -> 8.99",
    "California Roll -> 5.79",
    "Crunchy Tuna Roll -> 4.79",
    "Spring Roll -> 4.79",
    "Pad Thai -> 9.98",
    "Spicy Noodle -> 8.98",
    "Sake Nigiri --> 7.35",
      "Green Salad -> 6.78",
    "Tomyum soup -> 8.99"
    output: What would you like to order?
    input: Teriyaki
    output: Would you like to add more item?
    input: yes
    output: What would you to add?
    input: "Fried Chicken Tempura"
    output: Would you like to add more item?
    input: yes
    output: What would you to add?
    input: "California Roll"
    output: Would you like to add more item?
    input: yes
    output: What would you to add?
    input: "Crunchy Tuna Roll"
    output: Would you like to add more item?
    input: no
    output: Thank you!
    output:
    Your items:
    1."Teriyaki" 10.98
    2."Fried Chicken Tempura" 8.99
    3."California Roll" 5.79
    4."Crunchy Tuna Roll" 4.79
    Total before tax: $30.55
    Tax 9%: $2.75
    Total after tax: $33.30
    Formula to calculate sales tax: (30.55 * 0.09 = 2.75)
         */

        System.out.println("Menu:");
        print(menu);

        String food = null;

        do {
            food = ask(WHAT_WOULD_YOU_LIKE_TO_ORDER);
        } while (!isInMenu(food));

        addToBill(food);

        do {
            if (!isYes(ask(WOULD_YOU_LIKE_TO_ADD_MORE))) break; // if 'NO' exit

            food = ask(WHAT_WOULD_YOU_LIKE_TO_ADD);

            if (isInMenu(food)) {
                addToBill(food);
            }

        } while (true);

        System.out.println("Your items:");
        print(bill);

        double totalBeforeTax = getTotalBeforeTax();
        double tax = getTax(totalBeforeTax);
        double totalAfterTax = getTotalAfterTax(totalBeforeTax, tax);

        System.out.printf("Total before tax: %.2f\n", totalBeforeTax);
        System.out.println("Tax 9%: " + String.format("%.2f", tax));
        System.out.printf("Total after tax: %.2f\n", totalAfterTax);
    }

    private static double getTotalAfterTax(double totalBeforeTax, double tax) {
        return totalBeforeTax + tax;
    }

    private static double getTax(double totalBeforeTax) {
        return totalBeforeTax * 0.09;
    }

    private static double getTotalBeforeTax() {
        double totalBeforeTax = 0.0;
        for (Double value : bill.values()) {
            totalBeforeTax += value;
        }
        return totalBeforeTax;
    }

    private static boolean isYes(String reply) {

        return reply.equalsIgnoreCase("Y") || reply.equalsIgnoreCase("YES");
    }

    private static void addToBill(String food) {

        if (bill.containsKey(food)) {
            bill.put(food, menu.get(food) + bill.get(food)); //sum the price
        } else {
            bill.put(food, menu.get(food)); // menu.get return the price
        }
    }

    private static boolean isInMenu(String food) {
        if (menu.containsKey(food)) {
            return true;
        }

        System.out.println("There is no " + food + " in our menu.");
        return false;
    }

    private static String ask(String question) {

        System.out.println(question);

        return scan.nextLine();
    }

    private static void print(Map<String, Double> map) {

        for (Map.Entry<String, Double> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

