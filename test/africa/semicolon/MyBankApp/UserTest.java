package africa.semicolon.MyBankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User customer;
    Account account;
    @BeforeEach
    public void setUp(){
        customer = new User("Janet", "Ishola", 1234);

    }

    @Test
    public void customerCanAddFirstName(){
        customer.setFirstName("janet");
        assertEquals("janet", customer.getFirstName());
    }
    @Test
    public void customerCanAddLastName(){
        customer.setLastName("Ishola");
        assertEquals("Ishola", customer.getLastName());
    }
    @Test
    public void customerCanAddAddress(){
        customer.setAddress("312,Herbert Macaulay,Sabo-Yaba");
        assertEquals("312,Herbert Macaulay,Sabo-Yaba", customer.getAddress());
    }
    @Test
    public void customerCanAddPhoneNumber(){
        customer.setMobileNumber("08023456788");
        assertEquals("08023456788", customer.getMobileNumber());
    }
    @Test
    public void customerCannotAddPhoneNumberMoreThan11Digits(){
        String mobileNumber = "0802345678900";
        customer.setMobileNumber(mobileNumber);
        customer.IsDigitMoreThan11(mobileNumber);
        assertNull(customer.getMobileNumber());
    }
    @Test
    public void customerCanAddPin(){
        customer.setPin(1234);
        assertEquals(1234, customer.getPin());
    }
    @Test
    public void customerCanChangePin(){
        customer.setPin(1234);
        assertThrows(IllegalArgumentException.class,() ->  customer.setPin(1234));
    }
    @Test
    public void customerCanCreateAnAccount(){
        account = new Account();
        account.setAccountNumber(1);
        account.setAccountName(customer.getFirstName() + " " + customer.getLastName());
        customer.setAccount(account);
        assertEquals(1, customer.getAccount().getAccountNumber());

    }
    @Test
    public void customerShouldNotCreateAnAccountIfUserAlreadyHasAnAccount(){
        account = new Account();
        account.setAccountNumber(1);
        account.setAccountName(customer.getFirstName() + " " + customer.getLastName());
        customer.setAccount(account);
        assertEquals(1, customer.getAccount().getAccountNumber());
        Account account2 = new Account();
        account2.setAccountNumber(2);
        account2.setAccountName(customer.getFirstName() + " " + customer.getLastName());
        assertThrows(IllegalArgumentException.class, () -> customer.setAccount(account2));
    }




}
