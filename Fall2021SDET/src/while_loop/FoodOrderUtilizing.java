package while_loop;

import java.util.Scanner;

public class FoodOrderUtilizing {
     /*
    1. Welcome message to customers and ask what would they like?
    2. Ask if they would like to order more?
    3. and if yes then create a while loop to add orders
    4. adding orders should be done in a separate method
    5. print out the order items
     */

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to cafe. What would you like today?");
        StringBuilder order = new StringBuilder();

        order.append(scan.nextLine()).append("\n");

        System.out.println("Would you like to order anything else?");
        String moreItem = scan.nextLine();

        if(moreItem.equalsIgnoreCase("yes")){
            addMoreItems(order);
            System.out.println("Would you like to order anything else?");

        }

        System.out.println("Here is your oder items\n " + order);
    }

    static StringBuilder addMoreItems (StringBuilder order){

        System.out.println("What would you like?");

        return  order.append(scan.nextLine());
    }

}
