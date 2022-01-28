package practice.oop.complex;

public class HospitalApp {

    public static void main(String[] args) {

        Patient p1 = new Patient("01/02/1993","John", 'M', "7739995467");
        Patient p2 = new Patient("19/02/1967","Robert", 'M', "7734455468");

        p1.printAllInfo();
        p2.printAllInfo();

        p2.changeNumber("773 888 8345"); //using method to change the phone number (of existing object)
        p2.printAllInfo();

        p2.orderMedicine("Tylenol");
        p2.orderMedicine("Advil");
        p2.printAllInfo();
        System.out.println("===================");
        p2.payBalance(120);
        p2.printAllInfo();


    }
}
