package switch_case;

import java.util.Scanner;

public class OilChange {
    public static void main(String[] args) {

        double hourlyServicePrice = 40;
        double largeEngineOilChangePrice = 69.99;
        double smallEngineOilChangePrice = 29.99;
        double fluidsCheckServicePrice = 19.99;
        double brakeServicePrice = 299.99;
        double paintJobPrice = 199.99;

        System.out.println("Welcome to our shop. What type of service would you like today? \n" +
                "Choose from the options below:" +
                "\n1. Oil change" +
                "\n2. Fluids check" +
                "\n3. Brake pad change" +
                "\n4. Paint touch up");

        Scanner scanner = new Scanner(System.in);
        char typeOfService = scanner.next().charAt(0);
        System.out.println("Please enter the engine size:");
        int engineSize = (int) Math.ceil(scanner.nextDouble());
        System.out.println();

        String orderTotal = "YOUR TOTAL WITH HOURLY SERVICE CHARGE IS: $";

        switch (typeOfService) {
            case '1':
                if (engineSize > 4) {
                    System.out.println("Large engine has been selected.\n");
                    System.out.println(orderTotal + (largeEngineOilChangePrice + hourlyServicePrice));
                } else {
                    System.out.println("Small engine has been selected.\n");
                    System.out.println(orderTotal + (smallEngineOilChangePrice + hourlyServicePrice));
                }
                break;
            case '2':
                System.out.println("Fluid check has been selected.\n");
                System.out.println(orderTotal + (fluidsCheckServicePrice + hourlyServicePrice));
                break;
            case '3':
                System.out.println("Brake service has been selected.\n");
                System.out.println(orderTotal + (brakeServicePrice + hourlyServicePrice));
                break;
            case '4':
                System.out.println("Paint job has been selected.\n");
                System.out.println(orderTotal + (paintJobPrice + hourlyServicePrice));
                break;
            default:
                System.out.println("Sorry! We currently do not provide this service!");

//                Scanner input = new Scanner(System.in);
//
//                String typeOfServices = "Welcome to our shop. What type of service would you like today? \n" +
//                        "Choose from the options below:" +
//                        "\n1. Oil change" +
//                        "\n2. Fluids check" +
//                        "\n3. Brake pad change" +
//                        "\n4. Paint touch up" +
//                        "\nPlease choose '1', '2', '3' or '4'";
//
//                double hourlyServicePrice = 40;
//                double oilChangePrice = 29.99;
//                double fluidsCheckServicePrice = 19.99;
//                double brakeServicePrice = 299.99;
//                double paintJobPrice = 199.99;
//
//                String orderTotal = "YOUR TOTAL WITH HOURLY SERVICE CHARGE IS: $";
//
//                System.out.println(typeOfServices);
//                char typeOfService = input.next().charAt(0);
//                System.out.println("Please enter the engine size:");
//                double engineSize = input.nextDouble();
//
//                switch (typeOfService) {
//                    case '1':
//                        if (engineSize > 4)
//                            System.out.println("Large engine has been selected.\n");
//                        System.out.printf("Oil Change cost is %.4f ", oilChangePrice + hourlyServicePrice);
//                        break;
//                    case '2':
//                        if (engineSize)
//                            System.out.printf("Fluids Check cost is %.3f ", fluidsCheckServicePrice + hourlyServicePrice);
//                        break;
//                    case '3':
//                        System.out.printf("Brake pad change cost is %.2f ", brakeServicePrice + hourlyServicePrice);
//                        break;
//                    case '4':
//                        System.out.printf("Paint touch up cost is %.3f ", paintJobPrice + hourlyServicePrice);
//                    default:
//                        System.out.println("Please choose from our options");
//
//                        System.out.println("YOUR TOTAL WITH HOURLY SERVICE CHARGE IS: $");
//                }

        }
    }
}
