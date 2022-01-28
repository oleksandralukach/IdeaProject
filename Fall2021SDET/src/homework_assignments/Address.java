package homework_assignments;

public class Address {

    public static void main(String[] args) {


        /**
         * Write a program that provides more specific information about address
         * Any address can be inserted instead of a given address
         * get street address, city, state, and zipcode in separate variables and print them out
         */
        //TODO WRITE YOUR CODE HERE

        String address = "2400 E Devon Ave #215, Des Plaines, IL 60018";

        Address obj = new Address();
        System.out.println(obj.getStreetAddress(address));
        System.out.println(obj.getCity(address));
        System.out.println(obj.getState(address));
        System.out.println(obj.getZipcode(address));
    }

    public String getStreetAddress(String address) {

        String streetAddress = address.substring(0, address.indexOf(","));

        return streetAddress;
    }

    public String getCity(String address) {

        String city = address.substring(address.indexOf(",") + 1, address.length() - 10);

        return city;

        //String city = address.substring(address.indexOf(',') + 1, address.indexOf((',' + 1), ','));
//        int end = address.length() - 10;
//        String city = address.substring(address.indexOf(',') + 2, end);
//        return city;
    }

    public String getState(String address) {

        int start = address.length() - 9;
        int end = address.length() - 6;
        String state = address.substring(start, end).trim();
        return state;
    }

    public int getZipcode(String address) {

        String zippy = address.substring(address.length() - 5, address.length());
        return Integer.parseInt(zippy);
    }
}
