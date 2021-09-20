package africa.semicolon.chapterEight.SavingsAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SavingsAccountTest {
    private SavingsAccount savingsAccount;

    @BeforeEach
    void setUp(){
        savingsAccount = new SavingsAccount(3000.00);
    }
    @Test
    void testThatSavingsAccountHasSavingsBalance(){
        savingsAccount.setSavingsBalance(3000.00);
        assertEquals(3000.00, savingsAccount.getSavingsBalance());
    }
    @Test
    void testThatSystemCanCalculateMonthlyInterest(){
        savingsAccount.setSavingsBalance(3000.00);
        SavingsAccount.setAnnualInterestRate(4);
        assertEquals(1000.00, savingsAccount.calculateMonthlyInterest());
    }
    @Test
    void testThatSystemCanGetTotalSavingsBalanceAfterCalculatingMonthlyInterest(){
        savingsAccount.setSavingsBalance(3000.00);
        SavingsAccount.setAnnualInterestRate(4);
        assertEquals(1000.00, savingsAccount.calculateMonthlyInterest());
        savingsAccount.updateSavingsBalance();
        assertEquals(4000.00, savingsAccount.getSavingsBalance());
    }

    @Test
    void testThatSystemCanModifyInterestRate(){
        SavingsAccount.setAnnualInterestRate(4);
        assertEquals(4, SavingsAccount.getAnnualInterestRate());
    }

    @Test
    void testThatSystemHasTwoSavingsAccount(){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.setAnnualInterestRate(4);

        System.out.println("Saver1's savings balance is " + saver1.getSavingsBalance());
        System.out.println("Saver2's savings balance is " + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.updateSavingsBalance();
        saver2.updateSavingsBalance();

        System.out.println("Saver1's new balance is" + saver1.getSavingsBalance());
        System.out.println("Saver2's new balance is " + saver2.getSavingsBalance());
    }
    @Test
    void testThatSystemCanGetTheMonthlyInterestOfASavingsAccount(){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.setAnnualInterestRate(5);

        System.out.println("Saver1's savings balance is " + saver1.getSavingsBalance());
        System.out.println("Saver2's savings balance is " + saver2.getSavingsBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.updateSavingsBalance();
        saver2.updateSavingsBalance();

        System.out.println("Saver1's new balance is" + saver1.getSavingsBalance());
        System.out.println("Saver2's new balance is " + saver2.getSavingsBalance());
    }
}
