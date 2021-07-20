package africa.semicolon.Estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    void customerCanHasBillingInformationTest(){
        Customer customer = new Customer();
        BillingInformation billingInformation = new BillingInformation();
        Address address = new Address();
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        billingInformation.setReceiverName("Janet");
        billingInformation.setPhoneNumber("09028215330");
        address.setCityName("Ibadan");
        address.setCountryName("Nigeria");
        address.setHouseNumber(20);
        address.setStreet("Apata");
        address.setState("Oyo");
        billingInformation.setDeliveryAddress(address);
        creditCardInformation.setCardName("Janet");
        creditCardInformation.setCreditCardNumber("17828488585959");
        creditCardInformation.setCardType(CardType.MASTER_CARD);
        creditCardInformation.setMonth(12);
        creditCardInformation.setCardExpirationYear(2022);
        billingInformation.setCreditCardInformation(creditCardInformation);
        customer.addBillingInformation(billingInformation);
        assertEquals(1, customer.getNumbersOfBillingInformation());
    }
    @Test
    void BillingInformationHasAddress(){
        BillingInformation billingInformation = new BillingInformation();
        Address address = new Address();
        address.setCityName("Ibadan");
        address.setCountryName("Nigeria");
        address.setHouseNumber(20);
        address.setStreet("Apata");
        address.setState("Oyo");
        billingInformation.setDeliveryAddress(address);
    }
    @Test
    void BillingInformationHasCreditCardInformationTest(){
        BillingInformation billingInformation = new BillingInformation();
        CreditCardInformation creditCardInformation = new CreditCardInformation();
        creditCardInformation.setCardName("Janet");
        creditCardInformation.setCreditCardNumber("17828488585959");
        creditCardInformation.setCardType(CardType.MASTER_CARD);
        creditCardInformation.setMonth(12);
        creditCardInformation.setCardExpirationYear(2022);
        billingInformation.setCreditCardInformation(creditCardInformation);
    }
    @Test
    void shoppingCartContainItemsTest(){
        ShoppingCart shoppingCart = new ShoppingCart();
        Items items = new Items();
        Product product = new Product();
        product.setProductName("Bag");
        product.setPrice(3000);
        product.setProductId(1);
        product.setProductDescription("A nice bag");
        product.setProductCategory(ProductCategory.CLOTHING);
        items.setQuantity(4);
        items.setProducts(product);
    }
    @Test
    void ItemsContainProduct(){
        Items items = new Items();
        Product product = new Product();
        product.setProductName("Bag");
        product.setPrice(3000);
        product.setProductId(1);
        product.setProductDescription("A nice bag");
        product.setProductCategory(ProductCategory.CLOTHING);
        items.setProducts(product);
    }

}
