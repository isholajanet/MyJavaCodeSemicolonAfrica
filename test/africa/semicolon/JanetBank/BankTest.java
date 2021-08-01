package africa.semicolon.JanetBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankTest {
    Bank bank;
    Account account;
    Customer customer;
    @BeforeEach
    void setUp(){

        bank = new Bank();
        customer = new Customer("jane", "ishola", "janet@gmail.com", "09023456789");
        account = new Account();
    }
    @Test
    public void bankIsNotEmptyTest(){
        assertNotNull(bank);
    }
    @Test
    public void bankCanCreateAnAccountForCustomer(){
        bank.createAccount("Janet", "Ishola", "janetishola2010@gmail.com", "09023456789");
        assertEquals(1, bank.getNumberOfCustomer());
    }
    @Test
    public void bankGenerateARandomAccountNumberForNewAccountTest(){
        bank.createAccount("Janet", "Ishola", "janetishola2010@gmail.com", "09023456789");
        assertEquals(10001, bank.getAccountNumber());
    }
    @Test
    public void bankCanTransferMoneyBetweenTwoAccountTest(){
        Customer customer2 = new Customer("dunni", "olayemi", "dunni@gmail.com", "080243567881");
        bank.transfer(10001, 10002, 5000.00, 1234);
    }

    @Test
    public void bankCanLoginACustomerTest(){
      assertEquals(true, bank.login(10001, 1234));
    }


}
