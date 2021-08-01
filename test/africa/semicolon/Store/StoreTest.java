package africa.semicolon.Store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {
    Products myProducts;
    @BeforeEach

    void setUp(){
        myProducts = new Products("Milk", 1700.00, 2);
    }
    @Test
    void storeCanGetNameOfProduct(){
        myProducts.setProductName("Dano milk");
        assertEquals("Dano milk", myProducts.getProductName());
    }
    @Test
    void storeCanGetProductPrice(){
        myProducts.setProductPrice(1700.00);
        assertEquals(1700.00, myProducts.getProductPrice());
    }
    @Test
    void storeCanSetProductQuantity(){
        myProducts.setProductQuantity(2);
        assertEquals(2, myProducts.getProductQuantity());
    }
    @Test
    void storeCanGetTotalPriceOfGoodsBought(){
        myProducts.setProductPrice(1700.00);
        myProducts.setProductQuantity(2);
        assertEquals(3400.00, myProducts.getTotalPriceOfGoods());
    }
}
