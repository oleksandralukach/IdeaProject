package practice;

import java.util.*;

/**
 * * Create a shopping cart List so that when you add it doesn't repeat
 * * It would return a List of product name and quantity
 * *
 * * ex:
 * * out: Please enter a product item:
 * *  in: Apple
 * * out: Are you done?
 * *  in: No
 * * out: Please enter a product item:
 * *  in: Pear
 * * out: Are you done?
 * *  in: No
 * * out: Please enter a product item:
 * *  in: Apple
 * * out: Are you done?
 * *  in: Yes
 * * out: Your cart has:
 * * out: [apple: 2, pear: 1]
 * *
 * * Note: your list should be [item: numberOfItem, item: numberOfItem]
 */

public class ShoppingCart {

    public static void main(String[] args) {
        ShoppingCart shopping = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        List<String> cartInfo = shopping.createCart(scanner);
        System.out.println("Your cart has:\n" + cartInfo);
    }

    public List<String> createCart(Scanner scanner) {
        //TODO implement this method


        Map<String, Integer> mapCart = new HashMap<>();
        String item = "";


        while (scanner.hasNext()) {
            System.out.println("Please enter a product item:");
            item = scanner.nextLine();

            if (!mapCart.containsKey(item)){
                mapCart.put(item,1);
            } else{
                mapCart.put(item, mapCart.get(item)+1); // get() will return us value and we add 1 to thar value
            }

            System.out.println("Are you done");
            String respond = scanner.nextLine();
            if(respond.equalsIgnoreCase("y")){
                break;
            }
        }

        List<String> cart = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : mapCart.entrySet()){
            cart.add(entry.getKey().toLowerCase() + " : " + entry.getValue());
        }

        return cart;
    }
}

