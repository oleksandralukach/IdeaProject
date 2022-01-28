package methods;

public class MethodWithVariables {

    // unit number in int
    // street name in String
    // city in String
    // state in String
    // zipcode in int

    public static void printAddress(int unit, String street, String city, String state, int zipcode){

        System.out.println("The address: "
                + unit + "\n"
                + street + "\n"
                + city + "\n"
                + state + ", " + zipcode);

    }

    public static void main(String[] args) {

        printAddress(6, "Santa Monica blvd.", "Los Angeles", "CA", 90015);

    }
}
