package switch_case;

import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String itemOptions = "Please choose A, B or C:\n";

        String burgerMenu = itemOptions +
                "A. Cheeseburger $0.99\n" +
                "B. McChicken $1.99\n" +
                "C. Big Mac $3.99";

        String drinkMenu = itemOptions +
                "A. Coke $0.49\n" +
                "B. Diet Coke $0.49\n" +
                "C. Sprite $0.49";

        String saladMenu = itemOptions +
                "A. Caesar $2.49\n" +
                "B. Grilled Chicken $3.49\n" +
                "C. Green salad $2.99";

        double cheeseBurgerPrice = 0.99;
        double mcChickenPrice = 1.99;
        double bigMacPrice = 3.99;

        double cokePrice = 0.49;
        double dietCokePrice = 0.49;
        double spritePrice = 0.49;

        double caesarPrice = 2.49;
        double grilledChickenPrice = 3.49;
        double greenSaladPrice = 2.99;

        double total = 0;
        String orderItems = "";


        System.out.println("Welcome to McDonald's. Please select from the menu:");

        char burOption = ' ';
        int burAmount = 0;

        System.out.println("Would you like a burger? Select 'y' for yes and 'n' for no. ");
        char burYesOrNo = input.nextLine().charAt(0);

        if (burYesOrNo == 'y' || burYesOrNo == 'Y') {
            System.out.println(burgerMenu);
            burOption = input.nextLine().charAt(0);

            System.out.println("How many would you like?");
            burAmount = input.nextInt();

            switch (burOption) {
                case 'A':
                    total += cheeseBurgerPrice * burAmount;
                   orderItems = orderItems + "\n" + burAmount + "- Cheeseburger: $" + total;
                    break;
                case 'B':
                    total += mcChickenPrice * burAmount;
                    orderItems = orderItems + "\n" + burAmount + "- McChicken: $" + total;
                    break;
                case 'C':
                    total += bigMacPrice * burAmount;
                    orderItems = orderItems + "\n" + burAmount + "- BigMacPrice: $" + total;
                    break;
                default:
                    System.out.println("Please enter the provided choices.");
            }
        }

        int saladAmount = 0;
        char saladOption = ' ';

        System.out.println("Would you like to add a salad? Select 'y' for yes and 'n' for no. ");
        char saladYesOrNot = input.next().charAt(0);

        if (saladYesOrNot == 'y' || saladYesOrNot == 'Y') {
                System.out.println(saladOption + saladMenu);
                saladOption = input.next().charAt(0);

                System.out.println("How many would you like?");
                saladAmount = input.nextInt();

                switch (saladOption) {
                    case 'A':
                        total += caesarPrice * saladAmount;
                        orderItems = orderItems + "\n" + saladAmount + "- Cesar salad: $" + total;
                        break;
                    case 'B':
                        total += grilledChickenPrice * saladAmount;
                        orderItems = orderItems + "\n" + saladAmount + "- Grilled chicken salad: $" + total;
                        break;
                    case 'C':
                        total += greenSaladPrice * saladAmount;
                        orderItems = orderItems + "\n" + saladAmount + "- Green Salad: $" + total;
                        break;
                    default:
                        System.out.println("Please enter the provided choices.");
                }
            }

            System.out.println("Would you like to add a drink? Select 'y' for yes and 'n' for no. ");
            char drinkYesOrNot = input.next().charAt(0);
            int drinkAmount = 0;
            char drinkOption = ' ';

        if (drinkYesOrNot == 'y' || drinkYesOrNot == 'Y') {
                System.out.println(drinkOption + drinkMenu);
                drinkOption = input.next().charAt(0);

                System.out.println("How many would you like?");
                drinkAmount = input.nextInt();

              switch (drinkOption) {
                    case 'A', 'a':
                        total += cokePrice * drinkAmount;
                        orderItems += orderItems + "\n" + drinkAmount + "- Coke: $" + total;
                        break;
                    case 'B', 'b':
                        total += dietCokePrice * drinkAmount;
                        orderItems += orderItems + "\n" + drinkAmount + "- Diet Coke: $" + total;
                        break;
                    case 'C', 'c':
                        total += spritePrice * drinkAmount;
                        orderItems +=orderItems + "\n" + drinkAmount + "- Sprite: $" + total;
                        break;
                    default:
                        System.out.println("Please enter the provided choices.");
              }
        }
        System.out.println("Here is your order details: ");

        System.out.println(orderItems);
        System.out.println("Total: $" + total);

        /* other way (Yegor Bannov)
        switch (drinkOption){
                case 'A':
                    totalPrice += cokePrice * drinkAmount;
                    orderItems += drinkAmount + " - Coke(s), \n";
                    break;
                case 'B':
                    totalPrice += dietCokePrice * drinkAmount;
                    orderItems += drinkAmount + " - Diet Coke(s), \n";
                    break;
                case 'C':
                    totalPrice += spritePrice * drinkAmount;
                    orderItems += drinkAmount + " - Sprite(s), \n";
                    break;
                default:
                    System.out.println("Please enter the provided choices.");
            }
        }
        System.out.println("Here is your order details: ");
        System.out.println();
        System.out.format("The items you ordered are:\n %s \n", orderItems);
        System.out.printf("Your total: $%.2f", totalPrice);

         */
    }
}
