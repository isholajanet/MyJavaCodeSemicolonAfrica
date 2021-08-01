package africa.semicolon.MyBankApp;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankTest {
    Bank kudaBank;
    User newCustomer;
    @BeforeEach
    public void setUp(){
        kudaBank = new Bank();
        newCustomer = new User("Janet", "Ishola", 1234);
    }
    @Test
    public void bankCanCreateACustomerTest(){
        kudaBank.createCustomer(newCustomer);
        assertEquals(1, kudaBank.getCustomers().size());
    }
    @Test
    public void bankCanGenerateAccountNumberForCustomer(){
        kudaBank.createCustomer(newCustomer);
        assertEquals(1001, newCustomer.getAccountNumber());
    }
}
