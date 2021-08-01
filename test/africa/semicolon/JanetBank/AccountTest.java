package africa.semicolon.JanetBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountTest extends Bank{
    Account account;
    Customer customer;
    @BeforeEach
    void setUp(){
        customer = new Customer("jane", "ishola", "janet@gmail.com", "09023456789");
        account = new Account();
    }
    @Test
    void accountHasACustomer(){
        assertNotNull(account);
    }
    @Test
    void accountCanHaveAccountBalanceTest(){
        account.setAccountBalance(0.0);
        assertEquals(0.0, account.getAccountBalance());
    }
    @Test
    void accountCanDepositTest(){
        account.deposit(3000.00);
        assertEquals(3000.00, account.getAccountBalance());
    }
    @Test
    void accountCanWithdrawTest(){
        account.deposit(5000.00);
        account.withdraw(3000.00);
        assertEquals(2000.00, account.getAccountBalance());
    }
}
