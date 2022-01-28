package methods;

public class MethodsWithVar2 {


    public static void printAddress(int unit, String street, String city, String state, int zipcode) {

        System.out.println("The address: "
                + unit + "\n"
                + street + "\n"
                + city + "\n"
                + state + ", " + zipcode);
    }

    public static void main(String[] args) {

        int unit = 5;
        String street = "Las Palms";
        String city = "Santa Barbara";
        String state = "CA";
        int zipcode = 90076;

        printAddress(unit,street,city,state,zipcode);
    }
}
