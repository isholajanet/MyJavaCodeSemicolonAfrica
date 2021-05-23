package africa.semicolon.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static africa.semicolon.chapterThree.Account.displayAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account myAccount;
    @BeforeEach
    public void RunBeforeEachTest(){
        myAccount = new Account("Ishola Janet", 50.00);
    }
    @Test
    public void testThatAccountCanSetAccountName(){

        assertEquals("Ishola Janet", myAccount.getAccountName());
    }
    @Test
    public void testThatAccountCanSetAccountBalance(){
        myAccount.setAccountBalance(40.00);
        assertEquals(40.00, myAccount.getAccountBalance());
    }
    @Test
    public void testThatAccountCanDeposit(){
        myAccount.setAccountBalance(40.00);
        myAccount.deposit(50.00);
        assertEquals(90.00, myAccount.getAccountBalance());
    }
    @Test
    public void testThatDepositCannotAcceptNegativeValue(){
        myAccount.setAccountBalance(40.00);
        myAccount.deposit(-50.00);
        assertEquals(40.00, myAccount.getAccountBalance());
    }
    @Test
    public void testThatAccountCanWithdraw(){
        myAccount.setAccountBalance(100.00);
        myAccount.withdraw(50.00);
        assertEquals(50.00, myAccount.getAccountBalance());
    }
    @Test
    public void testThatAccountCannotWithdrawAboveTheAccountBalance(){
        myAccount.setAccountBalance(100.00);
        myAccount.withdraw(120.00);
        assertEquals(100.00, myAccount.getAccountBalance());
    }
    @Test
    public void testThatAccountCanDisplayAccount(){
        myAccount = new Account("Ishola Janet", 50.00);
        Account janet = new Account("Olayemi Oladunni", 400.00);
        displayAccount(janet);
        displayAccount(myAccount);


    }
}
