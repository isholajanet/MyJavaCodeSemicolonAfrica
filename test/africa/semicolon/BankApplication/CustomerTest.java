package africa.semicolon.BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    BankAccount bankAccount;
    @BeforeEach
    void setUp(){
        bankAccount = new BankAccount("Ishola Janet", 1234);
    }

    @Test
    void testThatCustomerCanSetPassword(){
        bankAccount.setPin(1234);
        assertEquals(1234, bankAccount.getPin());
    }
    @Test
    void testThatCustomerCanDepositMoney(){
        bankAccount.deposit(1000.00);
        assertEquals(1000.00, bankAccount.getAccountBalance());
    }
    @Test
    void testThatCustomerCanWithdrawMoney(){
        bankAccount.deposit(1500.00);
        bankAccount.withdraw(5000.00);
        assertEquals(1500.00, bankAccount.getAccountBalance());
    }
    @Test
    void testThatSystemCanTransferMoneyFromOneAccountToTheOther(){
        BankAccount newCustomer = new BankAccount();
        bankAccount.deposit(5000.00);
        double newAmount = bankAccount.withdraw(2000.00);
        newCustomer.deposit(newAmount);
        assertEquals(3000, bankAccount.getAccountBalance());
        assertEquals(2000, newCustomer.getAccountBalance());
    }
    @Test
    void testThatSystemCanLoadAirtimeFromAnAccountToAMobileNumber(){
        bankAccount.deposit(5000.00);
        bankAccount.loadAirtime( 1000);
        assertEquals(4000, bankAccount.getAccountBalance());
    }
    @Test
    void testThatSystemCanRegisterACustomer(){
        BankAccount firstCustomer = new BankAccount("Janet Ishola", 1234);
        BankAccount secondCustomer = new BankAccount("Janet Ishola", 1234);
        assertEquals(10001, firstCustomer.getAccountNumber());
        assertEquals(10002, secondCustomer.getAccountNumber());
    }



}
