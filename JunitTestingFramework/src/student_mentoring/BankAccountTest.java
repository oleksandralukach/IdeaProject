package student_mentoring;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {

    BankAccount obj = new BankAccount("Tom", "Johnson", 1000);

    @Test
    public void verifyDeposit() {
        //BankAccount Account01 = new BankAccount("Tom", "Johnson", 1000);

        Assert.assertTrue("Please verify your result.", 1400 == obj.deposit(400));


    }
}
