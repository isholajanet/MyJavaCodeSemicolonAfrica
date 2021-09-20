package africa.semicolon.chapterSeven.TotalSales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {
    Product product;

    @BeforeEach
    void setUp(){
        product = new Product(1, 200.00);
    }
    @Test
    void productIsNotNullTest(){
        assertNotNull(product);
    }
    @Test
    void productHasNumberTest(){
        assertEquals(1, product.getProductNumber());
    }
    @Test
    void productHasPriceTest(){
        assertEquals(200.00, product.getProductPrice());
    }
}
