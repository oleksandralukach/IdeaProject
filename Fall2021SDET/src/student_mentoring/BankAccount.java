package student_mentoring;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;

    }

    public static void main(String[] args) {
        BankAccount Account01 = new BankAccount("Tom", "Johnson", 1000);
        Account01.deposit(20_000); //argument
        Account01.deposit(500);
    }

    public double deposit (double amount){ //20_000 //parameter
        amount = addBonus(amount); // amount = updatedAmount
        balance +=amount; //1_000+20_600
        printOut(balance);
        return balance;
    }
    public double withdraw (double amount){
        balance -= amount;
        return balance;
    }

    public double addBonus (double amount){ //20_000
        double updatedAmount;
        if (amount > 1_500){
            updatedAmount = amount + (amount *0.03); // updatedAmount = 20_600
            return updatedAmount;
        } else updatedAmount = amount;
        return updatedAmount;
    }

    public void printOut (double balance){
        System.out.println("Your current balance is: " + balance);
    }
}