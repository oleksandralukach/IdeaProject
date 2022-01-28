package practice.oop.complex;

public class Patient {

    private String dob;
    private String name;
    private char gender;
    private String phoneNumber;
    private int balance;

    public Patient(String dob, String name, char gender, String phoneNumber) {
        this.dob = dob;
        this.name = name;
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else {
            System.out.println("No such a gender");
            System.out.println("Please choose a valid gender by calling a method setGender");
        }
        this.phoneNumber = phoneNumber;
    }

    public void printAllInfo() {
        System.out.println(dob);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println(balance);
    }

    //return the age of patient
    public int getAge() {
        //01/12/1999
        int year = Integer.parseInt(dob.substring(dob.lastIndexOf("/" + 1)));
        return 2021 - year;
    }

    //whichever patient object will call this method
    // we will change their number
    public void changeNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // update balance
    // charge patients if they orderMedicine
    // if the medicine is Ibuprofen patient needs to be charged $120
    // if Advil - $10
    // if Halls - $5
    // if we don't sell the medicine Say we don't sell this medicine

    public void orderMedicine(String medicine) {
        switch (medicine) {
            case "Ibuprofen":
                this.balance += 120;
                break;
            case "Advil":
                this.balance = balance + 10;
                break;
            case "Halls":
                this.balance = balance + 5;
                break;
            default:
                System.out.println("We don't sell this medicine");

        }
    }

    public void payBalance(int amount) {
        if (amount > this.balance) {
            int change = amount - balance;
            System.out.println("Your payment amount \"" + amount + "\" is bigger than balance \"" + balance + "\". " +
                    "So you will be charged just " + balance + ". And will be refunded the change: " + change);
            this.balance = 0;
        } else
            this.balance -= amount;
    }

    public void setGender(char gender) {
        if (gender == 'M' || gender == 'F') {
            this.gender = gender;
        } else
            System.out.println("No such a gender");
    }

}
