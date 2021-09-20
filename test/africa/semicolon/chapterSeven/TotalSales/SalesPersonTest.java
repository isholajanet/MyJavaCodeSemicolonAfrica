package africa.semicolon.chapterSeven.TotalSales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesPersonTest {
    SalesPerson salesPerson;

    @BeforeEach
    void setUp(){
        salesPerson = new SalesPerson(1);
    }
    @Test
    void salesPersonHasNumberTest(){
        assertEquals(1, salesPerson.getNumber());
    }

    @Test
    void testThatSalesPersonCanDisplaySlip(){
        Product product1 = new Product(1, 450.00);
        Slip slip1 = new Slip(product1, 3);

        Product product2 = new Product(2, 550.00);
        Slip slip2 = new Slip(product2, 5);

        Product product3 = new Product(3, 500.00);
        Slip slip3 = new Slip(product3, 7);

        Product product4 = new Product(4, 590.00);
        Slip slip4 = new Slip(product4, 5);

        Product product5 = new Product(5, 550.00);
        Slip slip5 = new Slip(product5, 9);

        salesPerson.insertSalesForEachProduct(slip1);
        salesPerson.insertSalesForEachProduct(slip2);
        salesPerson.insertSalesForEachProduct(slip3);
        salesPerson.insertSalesForEachProduct(slip4);
        salesPerson.insertSalesForEachProduct(slip5);

        System.out.println(Arrays.toString(salesPerson.getProducts()));

    }


}
