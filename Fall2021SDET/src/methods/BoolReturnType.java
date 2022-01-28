package methods;

import java.util.Scanner;

public class BoolReturnType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        System.out.println("Please input room number: ");
        int roomNumber = input.nextInt();

        BoolReturnType obj = new BoolReturnType();
        System.out.println(obj.isAvailable(roomNumber));
    }

    public boolean isAvailable(int numberOfRoom) {

        if (numberOfRoom >= 401 && numberOfRoom <= 410) {
            return true;
        } else {
            return false;
        }
    }
}
