package africa.semicolon.BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    Customer bankCustomer;
    @BeforeEach
    void setUp(){
        bankCustomer = new Customer("Janet", "Ishola", 1234);
    }

    @Test
    void testThatCustomerCanSetPassword(){
        bankCustomer.setPassword(1234);
        assertEquals(1234, bankCustomer.getPassWord());
    }
    @Test
    void testThatCustomerCanDepositMoney(){
        bankCustomer.deposit(1000.00);
        assertEquals(1000.00, bankCustomer.getAccountBalance());
    }
    @Test
    void testThatCustomerCanWithdrawMoney(){
        bankCustomer.deposit(1500.00);
        bankCustomer.withdraw(5000.00);
        assertEquals(1500.00, bankCustomer.getAccountBalance());
    }
    @Test
    void testThatSystemCanTransferMoneyFromOneAccountToTheOther(){
        Customer newCustomer = new Customer();
        bankCustomer.deposit(5000.00);
        double newAmount = bankCustomer.withdraw(2000.00);
        newCustomer.deposit(newAmount);
        assertEquals(3000, bankCustomer.getAccountBalance());
        assertEquals(2000, newCustomer.getAccountBalance());
    }
    @Test
    void testThatSystemCanLoadAirtimeFromAnAccountToAMobileNumber(){
        bankCustomer.deposit(5000.00);
        bankCustomer.loadAirtime(3552345, 1000);
        assertEquals(4000, bankCustomer.getAccountBalance());
    }
    @Test
    void testThatSystemCanRegisterACustomer(){
        Customer firstCustomer = new Customer("Janet", "Ishola", 1234);
        Customer secondCustomer = new Customer("Titobi", "Ligali", 4567);
        Customer thirdCustomer = new Customer("Olayemi", "Oladunni", 6789);
        Customer fourthCustomer = new Customer("Osinuga", "Timilehin", 1250);
        assertEquals(10001, firstCustomer.getAccountNumber());
        assertEquals(10002, secondCustomer.getAccountNumber());
        assertEquals(10003, thirdCustomer.getAccountNumber());
        assertEquals(10004, fourthCustomer.getAccountNumber());
    }

}
