package africa.semicolon.MyBankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;
    @BeforeEach
    public void setUp(){
        account = new Account();
    }
    @Test
    public void accountCanAddAccountName(){
        account.setAccountName("Janet");
        assertEquals("Janet", account.getAccountName());
    }
    @Test
    public void accountCanAssignAccountNumber(){
        account.setAccountNumber(1);
        assertEquals(1, account.getAccountNumber());
    }
    @Test
    public void accountCanAddAccountBalance(){
        account.setAccountBalance(1200.00);
        assertEquals(1200.00, account.getAccountBalance());
    }
}
