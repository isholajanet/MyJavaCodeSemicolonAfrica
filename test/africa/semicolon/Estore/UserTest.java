package africa.semicolon.Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user;
    @BeforeEach
    void setUp(){
        user = new User();
    }
    @Test
    void userCanSetNameTest(){
        user.setName("Janet");
        assertEquals("Janet", user.getName());
    }
    @Test
    void userCanSetAgeTest(){
        user.setAge(20);
        assertEquals(20, user.getAge());
    }
    @Test
    void userCanSetEmailAddressTest(){
        user.setEmailAddress("janetishola@gmail.com");
        assertEquals("janetishola@gmail.com", user.getEmailAddress());
    }
    @Test
    void userCanSetPasswordTest(){
        user.setPassword("janet");
        assertEquals("janet", user.getPassword());
    }
    @Test
    void userCanSetPhoneNumberTest(){
        user.setPhoneNumber("09028215330");
        assertEquals("09028215330", user.getPhoneNumber());
    }
    @Test
    void userCanBeInheritedByCustomerClass(){
        Customer customer = new Customer();
        customer.setName("Janet");
        assertEquals("Janet", customer.getName());
    }
    @Test
    void userCanBeInheritedBySellerClass(){
        Seller seller = new Seller();
        seller.setAge(19);
        assertEquals(19, seller.getAge());
    }
    @Test
    void userCanBeInheritedByAdminClass(){
        Admin admin = new Admin();
        admin.setName("Eniola");
        assertEquals("Eniola", admin.getName());
    }
    @Test
    void customerCanAddBillingInfoTest(){
        Customer customer = new Customer();
        BillingInformation billingInformation = new BillingInformation();
    }
}
